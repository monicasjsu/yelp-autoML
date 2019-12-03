# Yelp Star rating precition AutoML

## Prerequisites

- Java 1.8
- Scala 2.11.12
- Spark 2.3.2
- IntelliJ Idea 2017+ recommended
- TransmogrifAI 0.5.2


## Structure

The primary build file is in `build.gradle`.
This file defines dependencies on Scala, Spark, and TransmogrifAI, and also defines how the project will be built
and deployed.

The primary sources for your project live in `src/main/scala`.
The spark application that you should run whenever you want to train/score/evaluate/etc. is the Yelp
file in `src/main/scala/com/technocrats/yelp`.
Definitions for your features should reside in `src/main/scala/com/technocrats/yelp` as a case class, while the code that defines
where to get feature data from, what models to use, and any evaluation metrics lives in the application file.

## Workflow

You can run build commands by running `./gradlew` in this directory. Make sure that you have Spark installed, and that your
`SPARK_HOME` environment variable set to where you installed Spark.

### Building
To build the project, run `./gradlew build`. This will compile your sources and tell you of any compile errors.

### Training

Note: this platform runs on Spark, so you must download Spark 2.3.2 (prebuilt against hadoop 2.7), unpack and export `SPARK_HOME` before trying to run.

To train your project, run

```
./gradlew -q sparkSubmit -Dmain=com.technocrats.yelp.YelpModel -Dargs="--run-type=train --model-location /Users/moni/projects/yelp-autoML/build/spark/model \
--read-location YelpData=/Users/moni/projects/yelp-autoML/test-data/yelp_vegas_final.csv"
```

### Scoring
To score your project, run

```
./gradlew -q sparkSubmit -Dmain=com.technocrats.yelp.YelpModel -Dargs="--run-type=score --model-location /Users/moni/projects/yelp-autoML/build/spark/model \
--read-location YelpData=/Users/moni/projects/yelp-autoML/test-data/yelp_vegas_final.csv \
--write-location /Users/moni/projects/yelp-autoML/build/spark/scores"
```

Replace the `read-location` parameter with whatever file you want to read for scoring.

## Evaluation
To evaluate your project, run

```
./gradlew -q sparkSubmit -Dmain=com.technocrats.yelp.YelpModel -Dargs="--run-type=evaluate --model-location /Users/moni/projects/yelp-autoML/build/spark/model \
 --read-location Passenger=/Users/moni/projects/yelp-autoML/test-data/yelp_vegas_final.csv \
 --write-location /Users/moni/projects/yelp-autoML/build/spark/eval \
 --metrics-location /Users/moni/projects/yelp-autoML/build/spark/metrics"
```

## Read More

- [TransmogrifAI](https://github.com/salesforce/TransmogrifAI)
- [Docs](https://docs.transmogrif.ai)
- [Hello World examples](https://github.com/salesforce/TransmogrifAI/tree/master/helloworld)
