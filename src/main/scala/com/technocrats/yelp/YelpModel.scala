package com.technocrats.yelp

import com.salesforce.op._
import com.salesforce.op.features._
import com.salesforce.op.features.types._
import com.salesforce.op.stages.impl.classification._
import org.apache.spark.SparkConf
import org.apache.spark.sql.{Encoders, SparkSession}

case class YelpData
(
    review_count: Short,
    stars: Double,
    Alcohol: Short,
    Caters: Short,
    GoodForKids: Short,
    HasTV: Short,
    NoiseLevel: Short,
    OutdoorSeating: Short,
    RestaurantsDelivery: Short,
    RestaurantsGoodForGroups: Short,
    RestaurantsPriceRange2: Short,
    RestaurantsReservations: Short,
    RestaurantsTakeOut: Short,
    WiFi: Short,
    parking: Short,
    street: Short,
    valet: Short,
    casual: Short,
    classy: Short,
    divey: Short,
    hipster: Short,
    intimate: Short,
    romantic: Short,
    touristy: Short,
    trendy: Short,
    upscale: Short,
    breakfast: Short,
    brunch: Short,
    dessert: Short,
    dinner: Short,
    latenight: Short,
    lunch: Short,
    Vegan: Short,
    Mediterranean: Short,
    Indian: Short,
    Seafood: Short,
    Sandwiches: Short,
    Nightlife: Short,
    Salad: Short,
    Mexican: Short,
    Mongolian: Short,
    Thai: Short,
    FastFood: Short,
    AsianFusion: Short,
    Pizza: Short,
    Buffets: Short,
    Italian: Short,
    Korean: Short,
    French: Short,
    Vegetarian: Short,
    SushiBars: Short,
    Japanese: Short,
    Bars: Short,
    Chinese: Short,
    Burgers: Short,
    American: Short,
    score: Double
)

object YelpModel extends App {

  implicit val spark: SparkSession = SparkSession.builder
      .master("local[*]")
      .config(new SparkConf())
      .getOrCreate()

  var yelpData = spark.read.format("csv")
    .option("delimiter",",")
    .option("header", "true")
    .schema(Encoders.product[YelpData].schema)
    .load("yelp_vegas_final.csv")

  // Extract response and predictor Features
  val (survived, predictors) = FeatureBuilder.fromDataFrame[RealNN](yelpData, response = "stars")

//   Automated feature engineering
  val featureVector: FeatureLike[OPVector] = predictors.transmogrify()

  // Automated feature validation and selection
  val checkedFeatures = survived.sanityCheck(featureVector, removeBadFeatures = true)

  // Automated model selection
  val pred = MultiClassificationModelSelector().setInput(survived, featureVector).getOutput()

  // Setting up a TransmogrifAI workflow and training the model
  val model = new OpWorkflow().setInputDataset(yelpData).setResultFeatures(pred).train()

  println("Model summary:\n" + model.summaryPretty())
}


