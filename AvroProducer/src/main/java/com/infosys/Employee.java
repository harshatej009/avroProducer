/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.infosys;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** contains Employees Information */
@org.apache.avro.specific.AvroGenerated
public class Employee extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7814045527685226145L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Employee\",\"namespace\":\"com.infosys\",\"doc\":\"contains Employees Information\",\"fields\":[{\"name\":\"employeeID\",\"type\":\"int\"},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"surname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"designation\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Employee> ENCODER =
      new BinaryMessageEncoder<Employee>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Employee> DECODER =
      new BinaryMessageDecoder<Employee>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Employee> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Employee> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Employee>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Employee to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Employee from a ByteBuffer. */
  public static Employee fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int employeeID;
   private java.lang.String name;
   private java.lang.String surname;
   private java.lang.String designation;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Employee() {}

  /**
   * All-args constructor.
   * @param employeeID The new value for employeeID
   * @param name The new value for name
   * @param surname The new value for surname
   * @param designation The new value for designation
   */
  public Employee(java.lang.Integer employeeID, java.lang.String name, java.lang.String surname, java.lang.String designation) {
    this.employeeID = employeeID;
    this.name = name;
    this.surname = surname;
    this.designation = designation;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return employeeID;
    case 1: return name;
    case 2: return surname;
    case 3: return designation;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: employeeID = (java.lang.Integer)value$; break;
    case 1: name = (java.lang.String)value$; break;
    case 2: surname = (java.lang.String)value$; break;
    case 3: designation = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'employeeID' field.
   * @return The value of the 'employeeID' field.
   */
  public java.lang.Integer getEmployeeID() {
    return employeeID;
  }


  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }


  /**
   * Gets the value of the 'surname' field.
   * @return The value of the 'surname' field.
   */
  public java.lang.String getSurname() {
    return surname;
  }


  /**
   * Gets the value of the 'designation' field.
   * @return The value of the 'designation' field.
   */
  public java.lang.String getDesignation() {
    return designation;
  }


  /**
   * Creates a new Employee RecordBuilder.
   * @return A new Employee RecordBuilder
   */
  public static com.infosys.Employee.Builder newBuilder() {
    return new com.infosys.Employee.Builder();
  }

  /**
   * Creates a new Employee RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Employee RecordBuilder
   */
  public static com.infosys.Employee.Builder newBuilder(com.infosys.Employee.Builder other) {
    return new com.infosys.Employee.Builder(other);
  }

  /**
   * Creates a new Employee RecordBuilder by copying an existing Employee instance.
   * @param other The existing instance to copy.
   * @return A new Employee RecordBuilder
   */
  public static com.infosys.Employee.Builder newBuilder(com.infosys.Employee other) {
    return new com.infosys.Employee.Builder(other);
  }

  /**
   * RecordBuilder for Employee instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Employee>
    implements org.apache.avro.data.RecordBuilder<Employee> {

    private int employeeID;
    private java.lang.String name;
    private java.lang.String surname;
    private java.lang.String designation;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.infosys.Employee.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.employeeID)) {
        this.employeeID = data().deepCopy(fields()[0].schema(), other.employeeID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.surname)) {
        this.surname = data().deepCopy(fields()[2].schema(), other.surname);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.designation)) {
        this.designation = data().deepCopy(fields()[3].schema(), other.designation);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Employee instance
     * @param other The existing instance to copy.
     */
    private Builder(com.infosys.Employee other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.employeeID)) {
        this.employeeID = data().deepCopy(fields()[0].schema(), other.employeeID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.surname)) {
        this.surname = data().deepCopy(fields()[2].schema(), other.surname);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.designation)) {
        this.designation = data().deepCopy(fields()[3].schema(), other.designation);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'employeeID' field.
      * @return The value.
      */
    public java.lang.Integer getEmployeeID() {
      return employeeID;
    }

    /**
      * Sets the value of the 'employeeID' field.
      * @param value The value of 'employeeID'.
      * @return This builder.
      */
    public com.infosys.Employee.Builder setEmployeeID(int value) {
      validate(fields()[0], value);
      this.employeeID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'employeeID' field has been set.
      * @return True if the 'employeeID' field has been set, false otherwise.
      */
    public boolean hasEmployeeID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'employeeID' field.
      * @return This builder.
      */
    public com.infosys.Employee.Builder clearEmployeeID() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.infosys.Employee.Builder setName(java.lang.String value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.infosys.Employee.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'surname' field.
      * @return The value.
      */
    public java.lang.String getSurname() {
      return surname;
    }

    /**
      * Sets the value of the 'surname' field.
      * @param value The value of 'surname'.
      * @return This builder.
      */
    public com.infosys.Employee.Builder setSurname(java.lang.String value) {
      validate(fields()[2], value);
      this.surname = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'surname' field has been set.
      * @return True if the 'surname' field has been set, false otherwise.
      */
    public boolean hasSurname() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'surname' field.
      * @return This builder.
      */
    public com.infosys.Employee.Builder clearSurname() {
      surname = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'designation' field.
      * @return The value.
      */
    public java.lang.String getDesignation() {
      return designation;
    }

    /**
      * Sets the value of the 'designation' field.
      * @param value The value of 'designation'.
      * @return This builder.
      */
    public com.infosys.Employee.Builder setDesignation(java.lang.String value) {
      validate(fields()[3], value);
      this.designation = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'designation' field has been set.
      * @return True if the 'designation' field has been set, false otherwise.
      */
    public boolean hasDesignation() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'designation' field.
      * @return This builder.
      */
    public com.infosys.Employee.Builder clearDesignation() {
      designation = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Employee build() {
      try {
        Employee record = new Employee();
        record.employeeID = fieldSetFlags()[0] ? this.employeeID : (java.lang.Integer) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.String) defaultValue(fields()[1]);
        record.surname = fieldSetFlags()[2] ? this.surname : (java.lang.String) defaultValue(fields()[2]);
        record.designation = fieldSetFlags()[3] ? this.designation : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Employee>
    WRITER$ = (org.apache.avro.io.DatumWriter<Employee>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Employee>
    READER$ = (org.apache.avro.io.DatumReader<Employee>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
