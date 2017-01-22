/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-1-20")
public class LockPartitionResponse implements libthrift091.TBase<LockPartitionResponse, LockPartitionResponse._Fields>, java.io.Serializable, Cloneable, Comparable<LockPartitionResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("LockPartitionResponse");

  private static final libthrift091.protocol.TField SUCCESS_PARTITIONS_FIELD_DESC = new libthrift091.protocol.TField("successPartitions", libthrift091.protocol.TType.LIST, (short)1);
  private static final libthrift091.protocol.TField FAILED_PARTITIONS_FIELD_DESC = new libthrift091.protocol.TField("failedPartitions", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LockPartitionResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LockPartitionResponseTupleSchemeFactory());
  }

  /**
   * success lock partition list
   * 
   */
  public List<Integer> successPartitions; // required
  /**
   * failed lock partition list
   * 
   */
  public List<Integer> failedPartitions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * success lock partition list
     * 
     */
    SUCCESS_PARTITIONS((short)1, "successPartitions"),
    /**
     * failed lock partition list
     * 
     */
    FAILED_PARTITIONS((short)2, "failedPartitions");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SUCCESS_PARTITIONS
          return SUCCESS_PARTITIONS;
        case 2: // FAILED_PARTITIONS
          return FAILED_PARTITIONS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUCCESS_PARTITIONS, new libthrift091.meta_data.FieldMetaData("successPartitions", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32))));
    tmpMap.put(_Fields.FAILED_PARTITIONS, new libthrift091.meta_data.FieldMetaData("failedPartitions", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(LockPartitionResponse.class, metaDataMap);
  }

  public LockPartitionResponse() {
  }

  public LockPartitionResponse(
    List<Integer> successPartitions,
    List<Integer> failedPartitions)
  {
    this();
    this.successPartitions = successPartitions;
    this.failedPartitions = failedPartitions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LockPartitionResponse(LockPartitionResponse other) {
    if (other.isSetSuccessPartitions()) {
      List<Integer> __this__successPartitions = new ArrayList<Integer>(other.successPartitions);
      this.successPartitions = __this__successPartitions;
    }
    if (other.isSetFailedPartitions()) {
      List<Integer> __this__failedPartitions = new ArrayList<Integer>(other.failedPartitions);
      this.failedPartitions = __this__failedPartitions;
    }
  }

  public LockPartitionResponse deepCopy() {
    return new LockPartitionResponse(this);
  }

  @Override
  public void clear() {
    this.successPartitions = null;
    this.failedPartitions = null;
  }

  public int getSuccessPartitionsSize() {
    return (this.successPartitions == null) ? 0 : this.successPartitions.size();
  }

  public java.util.Iterator<Integer> getSuccessPartitionsIterator() {
    return (this.successPartitions == null) ? null : this.successPartitions.iterator();
  }

  public void addToSuccessPartitions(int elem) {
    if (this.successPartitions == null) {
      this.successPartitions = new ArrayList<Integer>();
    }
    this.successPartitions.add(elem);
  }

  /**
   * success lock partition list
   * 
   */
  public List<Integer> getSuccessPartitions() {
    return this.successPartitions;
  }

  /**
   * success lock partition list
   * 
   */
  public LockPartitionResponse setSuccessPartitions(List<Integer> successPartitions) {
    this.successPartitions = successPartitions;
    return this;
  }

  public void unsetSuccessPartitions() {
    this.successPartitions = null;
  }

  /** Returns true if field successPartitions is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccessPartitions() {
    return this.successPartitions != null;
  }

  public void setSuccessPartitionsIsSet(boolean value) {
    if (!value) {
      this.successPartitions = null;
    }
  }

  public int getFailedPartitionsSize() {
    return (this.failedPartitions == null) ? 0 : this.failedPartitions.size();
  }

  public java.util.Iterator<Integer> getFailedPartitionsIterator() {
    return (this.failedPartitions == null) ? null : this.failedPartitions.iterator();
  }

  public void addToFailedPartitions(int elem) {
    if (this.failedPartitions == null) {
      this.failedPartitions = new ArrayList<Integer>();
    }
    this.failedPartitions.add(elem);
  }

  /**
   * failed lock partition list
   * 
   */
  public List<Integer> getFailedPartitions() {
    return this.failedPartitions;
  }

  /**
   * failed lock partition list
   * 
   */
  public LockPartitionResponse setFailedPartitions(List<Integer> failedPartitions) {
    this.failedPartitions = failedPartitions;
    return this;
  }

  public void unsetFailedPartitions() {
    this.failedPartitions = null;
  }

  /** Returns true if field failedPartitions is set (has been assigned a value) and false otherwise */
  public boolean isSetFailedPartitions() {
    return this.failedPartitions != null;
  }

  public void setFailedPartitionsIsSet(boolean value) {
    if (!value) {
      this.failedPartitions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUCCESS_PARTITIONS:
      if (value == null) {
        unsetSuccessPartitions();
      } else {
        setSuccessPartitions((List<Integer>)value);
      }
      break;

    case FAILED_PARTITIONS:
      if (value == null) {
        unsetFailedPartitions();
      } else {
        setFailedPartitions((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUCCESS_PARTITIONS:
      return getSuccessPartitions();

    case FAILED_PARTITIONS:
      return getFailedPartitions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUCCESS_PARTITIONS:
      return isSetSuccessPartitions();
    case FAILED_PARTITIONS:
      return isSetFailedPartitions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LockPartitionResponse)
      return this.equals((LockPartitionResponse)that);
    return false;
  }

  public boolean equals(LockPartitionResponse that) {
    if (that == null)
      return false;

    boolean this_present_successPartitions = true && this.isSetSuccessPartitions();
    boolean that_present_successPartitions = true && that.isSetSuccessPartitions();
    if (this_present_successPartitions || that_present_successPartitions) {
      if (!(this_present_successPartitions && that_present_successPartitions))
        return false;
      if (!this.successPartitions.equals(that.successPartitions))
        return false;
    }

    boolean this_present_failedPartitions = true && this.isSetFailedPartitions();
    boolean that_present_failedPartitions = true && that.isSetFailedPartitions();
    if (this_present_failedPartitions || that_present_failedPartitions) {
      if (!(this_present_failedPartitions && that_present_failedPartitions))
        return false;
      if (!this.failedPartitions.equals(that.failedPartitions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_successPartitions = true && (isSetSuccessPartitions());
    list.add(present_successPartitions);
    if (present_successPartitions)
      list.add(successPartitions);

    boolean present_failedPartitions = true && (isSetFailedPartitions());
    list.add(present_failedPartitions);
    if (present_failedPartitions)
      list.add(failedPartitions);

    return list.hashCode();
  }

  @Override
  public int compareTo(LockPartitionResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSuccessPartitions()).compareTo(other.isSetSuccessPartitions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccessPartitions()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.successPartitions, other.successPartitions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFailedPartitions()).compareTo(other.isSetFailedPartitions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFailedPartitions()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.failedPartitions, other.failedPartitions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LockPartitionResponse(");
    boolean first = true;

    sb.append("successPartitions:");
    if (this.successPartitions == null) {
      sb.append("null");
    } else {
      sb.append(this.successPartitions);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("failedPartitions:");
    if (this.failedPartitions == null) {
      sb.append("null");
    } else {
      sb.append(this.failedPartitions);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (successPartitions == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'successPartitions' was not present! Struct: " + toString());
    }
    if (failedPartitions == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'failedPartitions' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LockPartitionResponseStandardSchemeFactory implements SchemeFactory {
    public LockPartitionResponseStandardScheme getScheme() {
      return new LockPartitionResponseStandardScheme();
    }
  }

  private static class LockPartitionResponseStandardScheme extends StandardScheme<LockPartitionResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, LockPartitionResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUCCESS_PARTITIONS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list8 = iprot.readListBegin();
                struct.successPartitions = new ArrayList<Integer>(_list8.size);
                int _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readI32();
                  struct.successPartitions.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setSuccessPartitionsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FAILED_PARTITIONS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list11 = iprot.readListBegin();
                struct.failedPartitions = new ArrayList<Integer>(_list11.size);
                int _elem12;
                for (int _i13 = 0; _i13 < _list11.size; ++_i13)
                {
                  _elem12 = iprot.readI32();
                  struct.failedPartitions.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setFailedPartitionsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, LockPartitionResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.successPartitions != null) {
        oprot.writeFieldBegin(SUCCESS_PARTITIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.I32, struct.successPartitions.size()));
          for (int _iter14 : struct.successPartitions)
          {
            oprot.writeI32(_iter14);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.failedPartitions != null) {
        oprot.writeFieldBegin(FAILED_PARTITIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.I32, struct.failedPartitions.size()));
          for (int _iter15 : struct.failedPartitions)
          {
            oprot.writeI32(_iter15);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LockPartitionResponseTupleSchemeFactory implements SchemeFactory {
    public LockPartitionResponseTupleScheme getScheme() {
      return new LockPartitionResponseTupleScheme();
    }
  }

  private static class LockPartitionResponseTupleScheme extends TupleScheme<LockPartitionResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, LockPartitionResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.successPartitions.size());
        for (int _iter16 : struct.successPartitions)
        {
          oprot.writeI32(_iter16);
        }
      }
      {
        oprot.writeI32(struct.failedPartitions.size());
        for (int _iter17 : struct.failedPartitions)
        {
          oprot.writeI32(_iter17);
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, LockPartitionResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        libthrift091.protocol.TList _list18 = new libthrift091.protocol.TList(libthrift091.protocol.TType.I32, iprot.readI32());
        struct.successPartitions = new ArrayList<Integer>(_list18.size);
        int _elem19;
        for (int _i20 = 0; _i20 < _list18.size; ++_i20)
        {
          _elem19 = iprot.readI32();
          struct.successPartitions.add(_elem19);
        }
      }
      struct.setSuccessPartitionsIsSet(true);
      {
        libthrift091.protocol.TList _list21 = new libthrift091.protocol.TList(libthrift091.protocol.TType.I32, iprot.readI32());
        struct.failedPartitions = new ArrayList<Integer>(_list21.size);
        int _elem22;
        for (int _i23 = 0; _i23 < _list21.size; ++_i23)
        {
          _elem22 = iprot.readI32();
          struct.failedPartitions.add(_elem22);
        }
      }
      struct.setFailedPartitionsIsSet(true);
    }
  }

}

