/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.technocrats.yelp.schema;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Passenger extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Passenger\",\"namespace\":\"com.salesforce.app.schema\",\"fields\":[{\"name\":\"PassengerId\",\"type\":[\"int\",\"null\"]},{\"name\":\"Survived\",\"type\":\"int\",\"default\":0},{\"name\":\"Pclass\",\"type\":[\"int\",\"null\"]},{\"name\":\"Name\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"Sex\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"Age\",\"type\":[\"double\",\"null\"]},{\"name\":\"SibSp\",\"type\":[\"int\",\"null\"]},{\"name\":\"Parch\",\"type\":[\"int\",\"null\"]},{\"name\":\"Ticket\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"Fare\",\"type\":[\"double\",\"null\"]},{\"name\":\"Cabin\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"Embarked\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Integer PassengerId;
  @Deprecated public int Survived;
  @Deprecated public java.lang.Integer Pclass;
  @Deprecated public java.lang.String Name;
  @Deprecated public java.lang.String Sex;
  @Deprecated public java.lang.Double Age;
  @Deprecated public java.lang.Integer SibSp;
  @Deprecated public java.lang.Integer Parch;
  @Deprecated public java.lang.String Ticket;
  @Deprecated public java.lang.Double Fare;
  @Deprecated public java.lang.String Cabin;
  @Deprecated public java.lang.String Embarked;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Passenger() {}

  /**
   * All-args constructor.
   */
  public Passenger(java.lang.Integer PassengerId, java.lang.Integer Survived, java.lang.Integer Pclass, java.lang.String Name, java.lang.String Sex, java.lang.Double Age, java.lang.Integer SibSp, java.lang.Integer Parch, java.lang.String Ticket, java.lang.Double Fare, java.lang.String Cabin, java.lang.String Embarked) {
    this.PassengerId = PassengerId;
    this.Survived = Survived;
    this.Pclass = Pclass;
    this.Name = Name;
    this.Sex = Sex;
    this.Age = Age;
    this.SibSp = SibSp;
    this.Parch = Parch;
    this.Ticket = Ticket;
    this.Fare = Fare;
    this.Cabin = Cabin;
    this.Embarked = Embarked;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return PassengerId;
    case 1: return Survived;
    case 2: return Pclass;
    case 3: return Name;
    case 4: return Sex;
    case 5: return Age;
    case 6: return SibSp;
    case 7: return Parch;
    case 8: return Ticket;
    case 9: return Fare;
    case 10: return Cabin;
    case 11: return Embarked;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: PassengerId = (java.lang.Integer)value$; break;
    case 1: Survived = (java.lang.Integer)value$; break;
    case 2: Pclass = (java.lang.Integer)value$; break;
    case 3: Name = (java.lang.String)value$; break;
    case 4: Sex = (java.lang.String)value$; break;
    case 5: Age = (java.lang.Double)value$; break;
    case 6: SibSp = (java.lang.Integer)value$; break;
    case 7: Parch = (java.lang.Integer)value$; break;
    case 8: Ticket = (java.lang.String)value$; break;
    case 9: Fare = (java.lang.Double)value$; break;
    case 10: Cabin = (java.lang.String)value$; break;
    case 11: Embarked = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'PassengerId' field.
   */
  public java.lang.Integer getPassengerId() {
    return PassengerId;
  }

  /**
   * Sets the value of the 'PassengerId' field.
   * @param value the value to set.
   */
  public void setPassengerId(java.lang.Integer value) {
    this.PassengerId = value;
  }

  /**
   * Gets the value of the 'Survived' field.
   */
  public java.lang.Integer getSurvived() {
    return Survived;
  }

  /**
   * Sets the value of the 'Survived' field.
   * @param value the value to set.
   */
  public void setSurvived(java.lang.Integer value) {
    this.Survived = value;
  }

  /**
   * Gets the value of the 'Pclass' field.
   */
  public java.lang.Integer getPclass() {
    return Pclass;
  }

  /**
   * Sets the value of the 'Pclass' field.
   * @param value the value to set.
   */
  public void setPclass(java.lang.Integer value) {
    this.Pclass = value;
  }

  /**
   * Gets the value of the 'Name' field.
   */
  public java.lang.String getName() {
    return Name;
  }

  /**
   * Sets the value of the 'Name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.Name = value;
  }

  /**
   * Gets the value of the 'Sex' field.
   */
  public java.lang.String getSex() {
    return Sex;
  }

  /**
   * Sets the value of the 'Sex' field.
   * @param value the value to set.
   */
  public void setSex(java.lang.String value) {
    this.Sex = value;
  }

  /**
   * Gets the value of the 'Age' field.
   */
  public java.lang.Double getAge() {
    return Age;
  }

  /**
   * Sets the value of the 'Age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Double value) {
    this.Age = value;
  }

  /**
   * Gets the value of the 'SibSp' field.
   */
  public java.lang.Integer getSibSp() {
    return SibSp;
  }

  /**
   * Sets the value of the 'SibSp' field.
   * @param value the value to set.
   */
  public void setSibSp(java.lang.Integer value) {
    this.SibSp = value;
  }

  /**
   * Gets the value of the 'Parch' field.
   */
  public java.lang.Integer getParch() {
    return Parch;
  }

  /**
   * Sets the value of the 'Parch' field.
   * @param value the value to set.
   */
  public void setParch(java.lang.Integer value) {
    this.Parch = value;
  }

  /**
   * Gets the value of the 'Ticket' field.
   */
  public java.lang.String getTicket() {
    return Ticket;
  }

  /**
   * Sets the value of the 'Ticket' field.
   * @param value the value to set.
   */
  public void setTicket(java.lang.String value) {
    this.Ticket = value;
  }

  /**
   * Gets the value of the 'Fare' field.
   */
  public java.lang.Double getFare() {
    return Fare;
  }

  /**
   * Sets the value of the 'Fare' field.
   * @param value the value to set.
   */
  public void setFare(java.lang.Double value) {
    this.Fare = value;
  }

  /**
   * Gets the value of the 'Cabin' field.
   */
  public java.lang.String getCabin() {
    return Cabin;
  }

  /**
   * Sets the value of the 'Cabin' field.
   * @param value the value to set.
   */
  public void setCabin(java.lang.String value) {
    this.Cabin = value;
  }

  /**
   * Gets the value of the 'Embarked' field.
   */
  public java.lang.String getEmbarked() {
    return Embarked;
  }

  /**
   * Sets the value of the 'Embarked' field.
   * @param value the value to set.
   */
  public void setEmbarked(java.lang.String value) {
    this.Embarked = value;
  }

  /** Creates a new Passenger RecordBuilder */
  public static Passenger.Builder newBuilder() {
    return new Passenger.Builder();
  }
  
  /** Creates a new Passenger RecordBuilder by copying an existing Builder */
  public static Passenger.Builder newBuilder(Passenger.Builder other) {
    return new Passenger.Builder(other);
  }
  
  /** Creates a new Passenger RecordBuilder by copying an existing Passenger instance */
  public static Passenger.Builder newBuilder(Passenger other) {
    return new Passenger.Builder(other);
  }
  
  /**
   * RecordBuilder for Passenger instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Passenger>
    implements org.apache.avro.data.RecordBuilder<Passenger> {

    private java.lang.Integer PassengerId;
    private int Survived;
    private java.lang.Integer Pclass;
    private java.lang.String Name;
    private java.lang.String Sex;
    private java.lang.Double Age;
    private java.lang.Integer SibSp;
    private java.lang.Integer Parch;
    private java.lang.String Ticket;
    private java.lang.Double Fare;
    private java.lang.String Cabin;
    private java.lang.String Embarked;

    /** Creates a new Builder */
    private Builder() {
      super(Passenger.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Passenger.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.PassengerId)) {
        this.PassengerId = data().deepCopy(fields()[0].schema(), other.PassengerId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Survived)) {
        this.Survived = data().deepCopy(fields()[1].schema(), other.Survived);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Pclass)) {
        this.Pclass = data().deepCopy(fields()[2].schema(), other.Pclass);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Name)) {
        this.Name = data().deepCopy(fields()[3].schema(), other.Name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Sex)) {
        this.Sex = data().deepCopy(fields()[4].schema(), other.Sex);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Age)) {
        this.Age = data().deepCopy(fields()[5].schema(), other.Age);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.SibSp)) {
        this.SibSp = data().deepCopy(fields()[6].schema(), other.SibSp);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.Parch)) {
        this.Parch = data().deepCopy(fields()[7].schema(), other.Parch);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.Ticket)) {
        this.Ticket = data().deepCopy(fields()[8].schema(), other.Ticket);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.Fare)) {
        this.Fare = data().deepCopy(fields()[9].schema(), other.Fare);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.Cabin)) {
        this.Cabin = data().deepCopy(fields()[10].schema(), other.Cabin);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.Embarked)) {
        this.Embarked = data().deepCopy(fields()[11].schema(), other.Embarked);
        fieldSetFlags()[11] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Passenger instance */
    private Builder(Passenger other) {
            super(Passenger.SCHEMA$);
      if (isValidValue(fields()[0], other.PassengerId)) {
        this.PassengerId = data().deepCopy(fields()[0].schema(), other.PassengerId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Survived)) {
        this.Survived = data().deepCopy(fields()[1].schema(), other.Survived);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Pclass)) {
        this.Pclass = data().deepCopy(fields()[2].schema(), other.Pclass);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Name)) {
        this.Name = data().deepCopy(fields()[3].schema(), other.Name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Sex)) {
        this.Sex = data().deepCopy(fields()[4].schema(), other.Sex);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Age)) {
        this.Age = data().deepCopy(fields()[5].schema(), other.Age);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.SibSp)) {
        this.SibSp = data().deepCopy(fields()[6].schema(), other.SibSp);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.Parch)) {
        this.Parch = data().deepCopy(fields()[7].schema(), other.Parch);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.Ticket)) {
        this.Ticket = data().deepCopy(fields()[8].schema(), other.Ticket);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.Fare)) {
        this.Fare = data().deepCopy(fields()[9].schema(), other.Fare);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.Cabin)) {
        this.Cabin = data().deepCopy(fields()[10].schema(), other.Cabin);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.Embarked)) {
        this.Embarked = data().deepCopy(fields()[11].schema(), other.Embarked);
        fieldSetFlags()[11] = true;
      }
    }

    /** Gets the value of the 'PassengerId' field */
    public java.lang.Integer getPassengerId() {
      return PassengerId;
    }
    
    /** Sets the value of the 'PassengerId' field */
    public Passenger.Builder setPassengerId(java.lang.Integer value) {
      validate(fields()[0], value);
      this.PassengerId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'PassengerId' field has been set */
    public boolean hasPassengerId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'PassengerId' field */
    public Passenger.Builder clearPassengerId() {
      PassengerId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'Survived' field */
    public java.lang.Integer getSurvived() {
      return Survived;
    }
    
    /** Sets the value of the 'Survived' field */
    public Passenger.Builder setSurvived(int value) {
      validate(fields()[1], value);
      this.Survived = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'Survived' field has been set */
    public boolean hasSurvived() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'Survived' field */
    public Passenger.Builder clearSurvived() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'Pclass' field */
    public java.lang.Integer getPclass() {
      return Pclass;
    }
    
    /** Sets the value of the 'Pclass' field */
    public Passenger.Builder setPclass(java.lang.Integer value) {
      validate(fields()[2], value);
      this.Pclass = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'Pclass' field has been set */
    public boolean hasPclass() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'Pclass' field */
    public Passenger.Builder clearPclass() {
      Pclass = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'Name' field */
    public java.lang.String getName() {
      return Name;
    }
    
    /** Sets the value of the 'Name' field */
    public Passenger.Builder setName(java.lang.String value) {
      validate(fields()[3], value);
      this.Name = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'Name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'Name' field */
    public Passenger.Builder clearName() {
      Name = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'Sex' field */
    public java.lang.String getSex() {
      return Sex;
    }
    
    /** Sets the value of the 'Sex' field */
    public Passenger.Builder setSex(java.lang.String value) {
      validate(fields()[4], value);
      this.Sex = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'Sex' field has been set */
    public boolean hasSex() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'Sex' field */
    public Passenger.Builder clearSex() {
      Sex = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'Age' field */
    public java.lang.Double getAge() {
      return Age;
    }
    
    /** Sets the value of the 'Age' field */
    public Passenger.Builder setAge(java.lang.Double value) {
      validate(fields()[5], value);
      this.Age = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'Age' field has been set */
    public boolean hasAge() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'Age' field */
    public Passenger.Builder clearAge() {
      Age = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'SibSp' field */
    public java.lang.Integer getSibSp() {
      return SibSp;
    }
    
    /** Sets the value of the 'SibSp' field */
    public Passenger.Builder setSibSp(java.lang.Integer value) {
      validate(fields()[6], value);
      this.SibSp = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'SibSp' field has been set */
    public boolean hasSibSp() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'SibSp' field */
    public Passenger.Builder clearSibSp() {
      SibSp = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'Parch' field */
    public java.lang.Integer getParch() {
      return Parch;
    }
    
    /** Sets the value of the 'Parch' field */
    public Passenger.Builder setParch(java.lang.Integer value) {
      validate(fields()[7], value);
      this.Parch = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'Parch' field has been set */
    public boolean hasParch() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'Parch' field */
    public Passenger.Builder clearParch() {
      Parch = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'Ticket' field */
    public java.lang.String getTicket() {
      return Ticket;
    }
    
    /** Sets the value of the 'Ticket' field */
    public Passenger.Builder setTicket(java.lang.String value) {
      validate(fields()[8], value);
      this.Ticket = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'Ticket' field has been set */
    public boolean hasTicket() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'Ticket' field */
    public Passenger.Builder clearTicket() {
      Ticket = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'Fare' field */
    public java.lang.Double getFare() {
      return Fare;
    }
    
    /** Sets the value of the 'Fare' field */
    public Passenger.Builder setFare(java.lang.Double value) {
      validate(fields()[9], value);
      this.Fare = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'Fare' field has been set */
    public boolean hasFare() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'Fare' field */
    public Passenger.Builder clearFare() {
      Fare = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'Cabin' field */
    public java.lang.String getCabin() {
      return Cabin;
    }
    
    /** Sets the value of the 'Cabin' field */
    public Passenger.Builder setCabin(java.lang.String value) {
      validate(fields()[10], value);
      this.Cabin = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'Cabin' field has been set */
    public boolean hasCabin() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'Cabin' field */
    public Passenger.Builder clearCabin() {
      Cabin = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'Embarked' field */
    public java.lang.String getEmbarked() {
      return Embarked;
    }
    
    /** Sets the value of the 'Embarked' field */
    public Passenger.Builder setEmbarked(java.lang.String value) {
      validate(fields()[11], value);
      this.Embarked = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'Embarked' field has been set */
    public boolean hasEmbarked() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'Embarked' field */
    public Passenger.Builder clearEmbarked() {
      Embarked = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    public Passenger build() {
      try {
        Passenger record = new Passenger();
        record.PassengerId = fieldSetFlags()[0] ? this.PassengerId : (java.lang.Integer) defaultValue(fields()[0]);
        record.Survived = fieldSetFlags()[1] ? this.Survived : (java.lang.Integer) defaultValue(fields()[1]);
        record.Pclass = fieldSetFlags()[2] ? this.Pclass : (java.lang.Integer) defaultValue(fields()[2]);
        record.Name = fieldSetFlags()[3] ? this.Name : (java.lang.String) defaultValue(fields()[3]);
        record.Sex = fieldSetFlags()[4] ? this.Sex : (java.lang.String) defaultValue(fields()[4]);
        record.Age = fieldSetFlags()[5] ? this.Age : (java.lang.Double) defaultValue(fields()[5]);
        record.SibSp = fieldSetFlags()[6] ? this.SibSp : (java.lang.Integer) defaultValue(fields()[6]);
        record.Parch = fieldSetFlags()[7] ? this.Parch : (java.lang.Integer) defaultValue(fields()[7]);
        record.Ticket = fieldSetFlags()[8] ? this.Ticket : (java.lang.String) defaultValue(fields()[8]);
        record.Fare = fieldSetFlags()[9] ? this.Fare : (java.lang.Double) defaultValue(fields()[9]);
        record.Cabin = fieldSetFlags()[10] ? this.Cabin : (java.lang.String) defaultValue(fields()[10]);
        record.Embarked = fieldSetFlags()[11] ? this.Embarked : (java.lang.String) defaultValue(fields()[11]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}