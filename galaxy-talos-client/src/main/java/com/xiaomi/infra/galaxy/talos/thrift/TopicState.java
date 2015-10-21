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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-21")
public class TopicState implements libthrift091.TBase<TopicState, TopicState._Fields>, java.io.Serializable, Cloneable, Comparable<TopicState> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TopicState");

  private static final libthrift091.protocol.TField CREATE_TIMESTAMP_FIELD_DESC = new libthrift091.protocol.TField("createTimestamp", libthrift091.protocol.TType.I64, (short)1);
  private static final libthrift091.protocol.TField TOPIC_STATUS_FIELD_DESC = new libthrift091.protocol.TField("topicStatus", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("messageNumber", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField MESSAGE_BYTES_FIELD_DESC = new libthrift091.protocol.TField("messageBytes", libthrift091.protocol.TType.I64, (short)4);
  private static final libthrift091.protocol.TField PARTITION_STATES_FIELD_DESC = new libthrift091.protocol.TField("partitionStates", libthrift091.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TopicStateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TopicStateTupleSchemeFactory());
  }

  /**
   * Create Timestamp for this topic;
   * 
   */
  public long createTimestamp; // required
  /**
   * Topic status for this topic;
   * 
   * 
   * @see TopicStatus
   */
  public TopicStatus topicStatus; // required
  /**
   * The message number in this topic(include all partitions);
   * 
   */
  public long messageNumber; // required
  /**
   * The message bytes in this topic(include all partitions);
   * 
   */
  public long messageBytes; // required
  /**
   * All partition state for this partition;
   * 
   */
  public List<PartitionState> partitionStates; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Create Timestamp for this topic;
     * 
     */
    CREATE_TIMESTAMP((short)1, "createTimestamp"),
    /**
     * Topic status for this topic;
     * 
     * 
     * @see TopicStatus
     */
    TOPIC_STATUS((short)2, "topicStatus"),
    /**
     * The message number in this topic(include all partitions);
     * 
     */
    MESSAGE_NUMBER((short)3, "messageNumber"),
    /**
     * The message bytes in this topic(include all partitions);
     * 
     */
    MESSAGE_BYTES((short)4, "messageBytes"),
    /**
     * All partition state for this partition;
     * 
     */
    PARTITION_STATES((short)5, "partitionStates");

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
        case 1: // CREATE_TIMESTAMP
          return CREATE_TIMESTAMP;
        case 2: // TOPIC_STATUS
          return TOPIC_STATUS;
        case 3: // MESSAGE_NUMBER
          return MESSAGE_NUMBER;
        case 4: // MESSAGE_BYTES
          return MESSAGE_BYTES;
        case 5: // PARTITION_STATES
          return PARTITION_STATES;
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
  private static final int __CREATETIMESTAMP_ISSET_ID = 0;
  private static final int __MESSAGENUMBER_ISSET_ID = 1;
  private static final int __MESSAGEBYTES_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CREATE_TIMESTAMP, new libthrift091.meta_data.FieldMetaData("createTimestamp", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.TOPIC_STATUS, new libthrift091.meta_data.FieldMetaData("topicStatus", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, TopicStatus.class)));
    tmpMap.put(_Fields.MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("messageNumber", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.MESSAGE_BYTES, new libthrift091.meta_data.FieldMetaData("messageBytes", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.PARTITION_STATES, new libthrift091.meta_data.FieldMetaData("partitionStates", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, PartitionState.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TopicState.class, metaDataMap);
  }

  public TopicState() {
  }

  public TopicState(
    long createTimestamp,
    TopicStatus topicStatus,
    long messageNumber,
    long messageBytes,
    List<PartitionState> partitionStates)
  {
    this();
    this.createTimestamp = createTimestamp;
    setCreateTimestampIsSet(true);
    this.topicStatus = topicStatus;
    this.messageNumber = messageNumber;
    setMessageNumberIsSet(true);
    this.messageBytes = messageBytes;
    setMessageBytesIsSet(true);
    this.partitionStates = partitionStates;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TopicState(TopicState other) {
    __isset_bitfield = other.__isset_bitfield;
    this.createTimestamp = other.createTimestamp;
    if (other.isSetTopicStatus()) {
      this.topicStatus = other.topicStatus;
    }
    this.messageNumber = other.messageNumber;
    this.messageBytes = other.messageBytes;
    if (other.isSetPartitionStates()) {
      List<PartitionState> __this__partitionStates = new ArrayList<PartitionState>(other.partitionStates.size());
      for (PartitionState other_element : other.partitionStates) {
        __this__partitionStates.add(new PartitionState(other_element));
      }
      this.partitionStates = __this__partitionStates;
    }
  }

  public TopicState deepCopy() {
    return new TopicState(this);
  }

  @Override
  public void clear() {
    setCreateTimestampIsSet(false);
    this.createTimestamp = 0;
    this.topicStatus = null;
    setMessageNumberIsSet(false);
    this.messageNumber = 0;
    setMessageBytesIsSet(false);
    this.messageBytes = 0;
    this.partitionStates = null;
  }

  /**
   * Create Timestamp for this topic;
   * 
   */
  public long getCreateTimestamp() {
    return this.createTimestamp;
  }

  /**
   * Create Timestamp for this topic;
   * 
   */
  public TopicState setCreateTimestamp(long createTimestamp) {
    this.createTimestamp = createTimestamp;
    setCreateTimestampIsSet(true);
    return this;
  }

  public void unsetCreateTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATETIMESTAMP_ISSET_ID);
  }

  /** Returns true if field createTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATETIMESTAMP_ISSET_ID);
  }

  public void setCreateTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATETIMESTAMP_ISSET_ID, value);
  }

  /**
   * Topic status for this topic;
   * 
   * 
   * @see TopicStatus
   */
  public TopicStatus getTopicStatus() {
    return this.topicStatus;
  }

  /**
   * Topic status for this topic;
   * 
   * 
   * @see TopicStatus
   */
  public TopicState setTopicStatus(TopicStatus topicStatus) {
    this.topicStatus = topicStatus;
    return this;
  }

  public void unsetTopicStatus() {
    this.topicStatus = null;
  }

  /** Returns true if field topicStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicStatus() {
    return this.topicStatus != null;
  }

  public void setTopicStatusIsSet(boolean value) {
    if (!value) {
      this.topicStatus = null;
    }
  }

  /**
   * The message number in this topic(include all partitions);
   * 
   */
  public long getMessageNumber() {
    return this.messageNumber;
  }

  /**
   * The message number in this topic(include all partitions);
   * 
   */
  public TopicState setMessageNumber(long messageNumber) {
    this.messageNumber = messageNumber;
    setMessageNumberIsSet(true);
    return this;
  }

  public void unsetMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field messageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID);
  }

  public void setMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID, value);
  }

  /**
   * The message bytes in this topic(include all partitions);
   * 
   */
  public long getMessageBytes() {
    return this.messageBytes;
  }

  /**
   * The message bytes in this topic(include all partitions);
   * 
   */
  public TopicState setMessageBytes(long messageBytes) {
    this.messageBytes = messageBytes;
    setMessageBytesIsSet(true);
    return this;
  }

  public void unsetMessageBytes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MESSAGEBYTES_ISSET_ID);
  }

  /** Returns true if field messageBytes is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageBytes() {
    return EncodingUtils.testBit(__isset_bitfield, __MESSAGEBYTES_ISSET_ID);
  }

  public void setMessageBytesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MESSAGEBYTES_ISSET_ID, value);
  }

  public int getPartitionStatesSize() {
    return (this.partitionStates == null) ? 0 : this.partitionStates.size();
  }

  public java.util.Iterator<PartitionState> getPartitionStatesIterator() {
    return (this.partitionStates == null) ? null : this.partitionStates.iterator();
  }

  public void addToPartitionStates(PartitionState elem) {
    if (this.partitionStates == null) {
      this.partitionStates = new ArrayList<PartitionState>();
    }
    this.partitionStates.add(elem);
  }

  /**
   * All partition state for this partition;
   * 
   */
  public List<PartitionState> getPartitionStates() {
    return this.partitionStates;
  }

  /**
   * All partition state for this partition;
   * 
   */
  public TopicState setPartitionStates(List<PartitionState> partitionStates) {
    this.partitionStates = partitionStates;
    return this;
  }

  public void unsetPartitionStates() {
    this.partitionStates = null;
  }

  /** Returns true if field partitionStates is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionStates() {
    return this.partitionStates != null;
  }

  public void setPartitionStatesIsSet(boolean value) {
    if (!value) {
      this.partitionStates = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CREATE_TIMESTAMP:
      if (value == null) {
        unsetCreateTimestamp();
      } else {
        setCreateTimestamp((Long)value);
      }
      break;

    case TOPIC_STATUS:
      if (value == null) {
        unsetTopicStatus();
      } else {
        setTopicStatus((TopicStatus)value);
      }
      break;

    case MESSAGE_NUMBER:
      if (value == null) {
        unsetMessageNumber();
      } else {
        setMessageNumber((Long)value);
      }
      break;

    case MESSAGE_BYTES:
      if (value == null) {
        unsetMessageBytes();
      } else {
        setMessageBytes((Long)value);
      }
      break;

    case PARTITION_STATES:
      if (value == null) {
        unsetPartitionStates();
      } else {
        setPartitionStates((List<PartitionState>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CREATE_TIMESTAMP:
      return Long.valueOf(getCreateTimestamp());

    case TOPIC_STATUS:
      return getTopicStatus();

    case MESSAGE_NUMBER:
      return Long.valueOf(getMessageNumber());

    case MESSAGE_BYTES:
      return Long.valueOf(getMessageBytes());

    case PARTITION_STATES:
      return getPartitionStates();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CREATE_TIMESTAMP:
      return isSetCreateTimestamp();
    case TOPIC_STATUS:
      return isSetTopicStatus();
    case MESSAGE_NUMBER:
      return isSetMessageNumber();
    case MESSAGE_BYTES:
      return isSetMessageBytes();
    case PARTITION_STATES:
      return isSetPartitionStates();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TopicState)
      return this.equals((TopicState)that);
    return false;
  }

  public boolean equals(TopicState that) {
    if (that == null)
      return false;

    boolean this_present_createTimestamp = true;
    boolean that_present_createTimestamp = true;
    if (this_present_createTimestamp || that_present_createTimestamp) {
      if (!(this_present_createTimestamp && that_present_createTimestamp))
        return false;
      if (this.createTimestamp != that.createTimestamp)
        return false;
    }

    boolean this_present_topicStatus = true && this.isSetTopicStatus();
    boolean that_present_topicStatus = true && that.isSetTopicStatus();
    if (this_present_topicStatus || that_present_topicStatus) {
      if (!(this_present_topicStatus && that_present_topicStatus))
        return false;
      if (!this.topicStatus.equals(that.topicStatus))
        return false;
    }

    boolean this_present_messageNumber = true;
    boolean that_present_messageNumber = true;
    if (this_present_messageNumber || that_present_messageNumber) {
      if (!(this_present_messageNumber && that_present_messageNumber))
        return false;
      if (this.messageNumber != that.messageNumber)
        return false;
    }

    boolean this_present_messageBytes = true;
    boolean that_present_messageBytes = true;
    if (this_present_messageBytes || that_present_messageBytes) {
      if (!(this_present_messageBytes && that_present_messageBytes))
        return false;
      if (this.messageBytes != that.messageBytes)
        return false;
    }

    boolean this_present_partitionStates = true && this.isSetPartitionStates();
    boolean that_present_partitionStates = true && that.isSetPartitionStates();
    if (this_present_partitionStates || that_present_partitionStates) {
      if (!(this_present_partitionStates && that_present_partitionStates))
        return false;
      if (!this.partitionStates.equals(that.partitionStates))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_createTimestamp = true;
    list.add(present_createTimestamp);
    if (present_createTimestamp)
      list.add(createTimestamp);

    boolean present_topicStatus = true && (isSetTopicStatus());
    list.add(present_topicStatus);
    if (present_topicStatus)
      list.add(topicStatus.getValue());

    boolean present_messageNumber = true;
    list.add(present_messageNumber);
    if (present_messageNumber)
      list.add(messageNumber);

    boolean present_messageBytes = true;
    list.add(present_messageBytes);
    if (present_messageBytes)
      list.add(messageBytes);

    boolean present_partitionStates = true && (isSetPartitionStates());
    list.add(present_partitionStates);
    if (present_partitionStates)
      list.add(partitionStates);

    return list.hashCode();
  }

  @Override
  public int compareTo(TopicState other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCreateTimestamp()).compareTo(other.isSetCreateTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTimestamp()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.createTimestamp, other.createTimestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicStatus()).compareTo(other.isSetTopicStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicStatus()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicStatus, other.topicStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageNumber()).compareTo(other.isSetMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageNumber, other.messageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageBytes()).compareTo(other.isSetMessageBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageBytes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageBytes, other.messageBytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionStates()).compareTo(other.isSetPartitionStates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionStates()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.partitionStates, other.partitionStates);
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
    StringBuilder sb = new StringBuilder("TopicState(");
    boolean first = true;

    sb.append("createTimestamp:");
    sb.append(this.createTimestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("topicStatus:");
    if (this.topicStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.topicStatus);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageNumber:");
    sb.append(this.messageNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageBytes:");
    sb.append(this.messageBytes);
    first = false;
    if (!first) sb.append(", ");
    sb.append("partitionStates:");
    if (this.partitionStates == null) {
      sb.append("null");
    } else {
      sb.append(this.partitionStates);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // alas, we cannot check 'createTimestamp' because it's a primitive and you chose the non-beans generator.
    if (topicStatus == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicStatus' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'messageNumber' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'messageBytes' because it's a primitive and you chose the non-beans generator.
    if (partitionStates == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'partitionStates' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TopicStateStandardSchemeFactory implements SchemeFactory {
    public TopicStateStandardScheme getScheme() {
      return new TopicStateStandardScheme();
    }
  }

  private static class TopicStateStandardScheme extends StandardScheme<TopicState> {

    public void read(libthrift091.protocol.TProtocol iprot, TopicState struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CREATE_TIMESTAMP
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.createTimestamp = iprot.readI64();
              struct.setCreateTimestampIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOPIC_STATUS
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.topicStatus = com.xiaomi.infra.galaxy.talos.thrift.TopicStatus.findByValue(iprot.readI32());
              struct.setTopicStatusIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.messageNumber = iprot.readI64();
              struct.setMessageNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MESSAGE_BYTES
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.messageBytes = iprot.readI64();
              struct.setMessageBytesIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARTITION_STATES
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list0 = iprot.readListBegin();
                struct.partitionStates = new ArrayList<PartitionState>(_list0.size);
                PartitionState _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new PartitionState();
                  _elem1.read(iprot);
                  struct.partitionStates.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setPartitionStatesIsSet(true);
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
      if (!struct.isSetCreateTimestamp()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'createTimestamp' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetMessageNumber()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'messageNumber' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetMessageBytes()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'messageBytes' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, TopicState struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CREATE_TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.createTimestamp);
      oprot.writeFieldEnd();
      if (struct.topicStatus != null) {
        oprot.writeFieldBegin(TOPIC_STATUS_FIELD_DESC);
        oprot.writeI32(struct.topicStatus.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MESSAGE_NUMBER_FIELD_DESC);
      oprot.writeI64(struct.messageNumber);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MESSAGE_BYTES_FIELD_DESC);
      oprot.writeI64(struct.messageBytes);
      oprot.writeFieldEnd();
      if (struct.partitionStates != null) {
        oprot.writeFieldBegin(PARTITION_STATES_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.partitionStates.size()));
          for (PartitionState _iter3 : struct.partitionStates)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TopicStateTupleSchemeFactory implements SchemeFactory {
    public TopicStateTupleScheme getScheme() {
      return new TopicStateTupleScheme();
    }
  }

  private static class TopicStateTupleScheme extends TupleScheme<TopicState> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TopicState struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.createTimestamp);
      oprot.writeI32(struct.topicStatus.getValue());
      oprot.writeI64(struct.messageNumber);
      oprot.writeI64(struct.messageBytes);
      {
        oprot.writeI32(struct.partitionStates.size());
        for (PartitionState _iter4 : struct.partitionStates)
        {
          _iter4.write(oprot);
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TopicState struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.createTimestamp = iprot.readI64();
      struct.setCreateTimestampIsSet(true);
      struct.topicStatus = com.xiaomi.infra.galaxy.talos.thrift.TopicStatus.findByValue(iprot.readI32());
      struct.setTopicStatusIsSet(true);
      struct.messageNumber = iprot.readI64();
      struct.setMessageNumberIsSet(true);
      struct.messageBytes = iprot.readI64();
      struct.setMessageBytesIsSet(true);
      {
        libthrift091.protocol.TList _list5 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.partitionStates = new ArrayList<PartitionState>(_list5.size);
        PartitionState _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new PartitionState();
          _elem6.read(iprot);
          struct.partitionStates.add(_elem6);
        }
      }
      struct.setPartitionStatesIsSet(true);
    }
  }

}

