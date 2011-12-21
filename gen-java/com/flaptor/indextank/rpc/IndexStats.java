/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.flaptor.indextank.rpc;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

@SuppressWarnings("all") public class IndexStats implements TBase<IndexStats, IndexStats._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("IndexStats");

  private static final TField USED_DISK_FIELD_DESC = new TField("used_disk", TType.I32, (short)2);
  private static final TField USED_MEM_FIELD_DESC = new TField("used_mem", TType.I32, (short)3);

  private int used_disk;
  private int used_mem;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    USED_DISK((short)2, "used_disk"),
    USED_MEM((short)3, "used_mem");

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
        case 2: // USED_DISK
          return USED_DISK;
        case 3: // USED_MEM
          return USED_MEM;
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
  private static final int __USED_DISK_ISSET_ID = 0;
  private static final int __USED_MEM_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USED_DISK, new FieldMetaData("used_disk", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.USED_MEM, new FieldMetaData("used_mem", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(IndexStats.class, metaDataMap);
  }

  public IndexStats() {
  }

  public IndexStats(
    int used_disk,
    int used_mem)
  {
    this();
    this.used_disk = used_disk;
    set_used_disk_isSet(true);
    this.used_mem = used_mem;
    set_used_mem_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IndexStats(IndexStats other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.used_disk = other.used_disk;
    this.used_mem = other.used_mem;
  }

  public IndexStats deepCopy() {
    return new IndexStats(this);
  }

  @Override
  public void clear() {
    set_used_disk_isSet(false);
    this.used_disk = 0;
    set_used_mem_isSet(false);
    this.used_mem = 0;
  }

  public int get_used_disk() {
    return this.used_disk;
  }

  public IndexStats set_used_disk(int used_disk) {
    this.used_disk = used_disk;
    set_used_disk_isSet(true);
    return this;
  }

  public void unset_used_disk() {
    __isset_bit_vector.clear(__USED_DISK_ISSET_ID);
  }

  /** Returns true if field used_disk is set (has been asigned a value) and false otherwise */
  public boolean is_set_used_disk() {
    return __isset_bit_vector.get(__USED_DISK_ISSET_ID);
  }

  public void set_used_disk_isSet(boolean value) {
    __isset_bit_vector.set(__USED_DISK_ISSET_ID, value);
  }

  public int get_used_mem() {
    return this.used_mem;
  }

  public IndexStats set_used_mem(int used_mem) {
    this.used_mem = used_mem;
    set_used_mem_isSet(true);
    return this;
  }

  public void unset_used_mem() {
    __isset_bit_vector.clear(__USED_MEM_ISSET_ID);
  }

  /** Returns true if field used_mem is set (has been asigned a value) and false otherwise */
  public boolean is_set_used_mem() {
    return __isset_bit_vector.get(__USED_MEM_ISSET_ID);
  }

  public void set_used_mem_isSet(boolean value) {
    __isset_bit_vector.set(__USED_MEM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USED_DISK:
      if (value == null) {
        unset_used_disk();
      } else {
        set_used_disk((Integer)value);
      }
      break;

    case USED_MEM:
      if (value == null) {
        unset_used_mem();
      } else {
        set_used_mem((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_DISK:
      return new Integer(get_used_disk());

    case USED_MEM:
      return new Integer(get_used_mem());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USED_DISK:
      return is_set_used_disk();
    case USED_MEM:
      return is_set_used_mem();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IndexStats)
      return this.equals((IndexStats)that);
    return false;
  }

  public boolean equals(IndexStats that) {
    if (that == null)
      return false;

    boolean this_present_used_disk = true;
    boolean that_present_used_disk = true;
    if (this_present_used_disk || that_present_used_disk) {
      if (!(this_present_used_disk && that_present_used_disk))
        return false;
      if (this.used_disk != that.used_disk)
        return false;
    }

    boolean this_present_used_mem = true;
    boolean that_present_used_mem = true;
    if (this_present_used_mem || that_present_used_mem) {
      if (!(this_present_used_mem && that_present_used_mem))
        return false;
      if (this.used_mem != that.used_mem)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(IndexStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    IndexStats typedOther = (IndexStats)other;

    lastComparison = Boolean.valueOf(is_set_used_disk()).compareTo(typedOther.is_set_used_disk());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_used_disk()) {
      lastComparison = TBaseHelper.compareTo(this.used_disk, typedOther.used_disk);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_used_mem()).compareTo(typedOther.is_set_used_mem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_used_mem()) {
      lastComparison = TBaseHelper.compareTo(this.used_mem, typedOther.used_mem);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 2: // USED_DISK
          if (field.type == TType.I32) {
            this.used_disk = iprot.readI32();
            set_used_disk_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // USED_MEM
          if (field.type == TType.I32) {
            this.used_mem = iprot.readI32();
            set_used_mem_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(USED_DISK_FIELD_DESC);
    oprot.writeI32(this.used_disk);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(USED_MEM_FIELD_DESC);
    oprot.writeI32(this.used_mem);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("IndexStats(");
    boolean first = true;

    sb.append("used_disk:");
    sb.append(this.used_disk);
    first = false;
    if (!first) sb.append(", ");
    sb.append("used_mem:");
    sb.append(this.used_mem);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
