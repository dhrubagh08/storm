/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class SupervisorPageInfo implements org.apache.thrift.TBase<SupervisorPageInfo, SupervisorPageInfo._Fields>, java.io.Serializable, Cloneable, Comparable<SupervisorPageInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SupervisorPageInfo");

  private static final org.apache.thrift.protocol.TField SUPERVISOR_SUMMARIES_FIELD_DESC = new org.apache.thrift.protocol.TField("supervisor_summaries", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField WORKER_SUMMARIES_FIELD_DESC = new org.apache.thrift.protocol.TField("worker_summaries", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SupervisorPageInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SupervisorPageInfoTupleSchemeFactory());
  }

  private List<SupervisorSummary> supervisor_summaries; // optional
  private List<WorkerSummary> worker_summaries; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUPERVISOR_SUMMARIES((short)1, "supervisor_summaries"),
    WORKER_SUMMARIES((short)2, "worker_summaries");

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
        case 1: // SUPERVISOR_SUMMARIES
          return SUPERVISOR_SUMMARIES;
        case 2: // WORKER_SUMMARIES
          return WORKER_SUMMARIES;
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
  private static final _Fields optionals[] = {_Fields.SUPERVISOR_SUMMARIES,_Fields.WORKER_SUMMARIES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUPERVISOR_SUMMARIES, new org.apache.thrift.meta_data.FieldMetaData("supervisor_summaries", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SupervisorSummary.class))));
    tmpMap.put(_Fields.WORKER_SUMMARIES, new org.apache.thrift.meta_data.FieldMetaData("worker_summaries", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, WorkerSummary.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SupervisorPageInfo.class, metaDataMap);
  }

  public SupervisorPageInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SupervisorPageInfo(SupervisorPageInfo other) {
    if (other.is_set_supervisor_summaries()) {
      List<SupervisorSummary> __this__supervisor_summaries = new ArrayList<SupervisorSummary>(other.supervisor_summaries.size());
      for (SupervisorSummary other_element : other.supervisor_summaries) {
        __this__supervisor_summaries.add(new SupervisorSummary(other_element));
      }
      this.supervisor_summaries = __this__supervisor_summaries;
    }
    if (other.is_set_worker_summaries()) {
      List<WorkerSummary> __this__worker_summaries = new ArrayList<WorkerSummary>(other.worker_summaries.size());
      for (WorkerSummary other_element : other.worker_summaries) {
        __this__worker_summaries.add(new WorkerSummary(other_element));
      }
      this.worker_summaries = __this__worker_summaries;
    }
  }

  public SupervisorPageInfo deepCopy() {
    return new SupervisorPageInfo(this);
  }

  @Override
  public void clear() {
    this.supervisor_summaries = null;
    this.worker_summaries = null;
  }

  public int get_supervisor_summaries_size() {
    return (this.supervisor_summaries == null) ? 0 : this.supervisor_summaries.size();
  }

  public java.util.Iterator<SupervisorSummary> get_supervisor_summaries_iterator() {
    return (this.supervisor_summaries == null) ? null : this.supervisor_summaries.iterator();
  }

  public void add_to_supervisor_summaries(SupervisorSummary elem) {
    if (this.supervisor_summaries == null) {
      this.supervisor_summaries = new ArrayList<SupervisorSummary>();
    }
    this.supervisor_summaries.add(elem);
  }

  public List<SupervisorSummary> get_supervisor_summaries() {
    return this.supervisor_summaries;
  }

  public void set_supervisor_summaries(List<SupervisorSummary> supervisor_summaries) {
    this.supervisor_summaries = supervisor_summaries;
  }

  public void unset_supervisor_summaries() {
    this.supervisor_summaries = null;
  }

  /** Returns true if field supervisor_summaries is set (has been assigned a value) and false otherwise */
  public boolean is_set_supervisor_summaries() {
    return this.supervisor_summaries != null;
  }

  public void set_supervisor_summaries_isSet(boolean value) {
    if (!value) {
      this.supervisor_summaries = null;
    }
  }

  public int get_worker_summaries_size() {
    return (this.worker_summaries == null) ? 0 : this.worker_summaries.size();
  }

  public java.util.Iterator<WorkerSummary> get_worker_summaries_iterator() {
    return (this.worker_summaries == null) ? null : this.worker_summaries.iterator();
  }

  public void add_to_worker_summaries(WorkerSummary elem) {
    if (this.worker_summaries == null) {
      this.worker_summaries = new ArrayList<WorkerSummary>();
    }
    this.worker_summaries.add(elem);
  }

  public List<WorkerSummary> get_worker_summaries() {
    return this.worker_summaries;
  }

  public void set_worker_summaries(List<WorkerSummary> worker_summaries) {
    this.worker_summaries = worker_summaries;
  }

  public void unset_worker_summaries() {
    this.worker_summaries = null;
  }

  /** Returns true if field worker_summaries is set (has been assigned a value) and false otherwise */
  public boolean is_set_worker_summaries() {
    return this.worker_summaries != null;
  }

  public void set_worker_summaries_isSet(boolean value) {
    if (!value) {
      this.worker_summaries = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUPERVISOR_SUMMARIES:
      if (value == null) {
        unset_supervisor_summaries();
      } else {
        set_supervisor_summaries((List<SupervisorSummary>)value);
      }
      break;

    case WORKER_SUMMARIES:
      if (value == null) {
        unset_worker_summaries();
      } else {
        set_worker_summaries((List<WorkerSummary>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUPERVISOR_SUMMARIES:
      return get_supervisor_summaries();

    case WORKER_SUMMARIES:
      return get_worker_summaries();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUPERVISOR_SUMMARIES:
      return is_set_supervisor_summaries();
    case WORKER_SUMMARIES:
      return is_set_worker_summaries();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SupervisorPageInfo)
      return this.equals((SupervisorPageInfo)that);
    return false;
  }

  public boolean equals(SupervisorPageInfo that) {
    if (that == null)
      return false;

    boolean this_present_supervisor_summaries = true && this.is_set_supervisor_summaries();
    boolean that_present_supervisor_summaries = true && that.is_set_supervisor_summaries();
    if (this_present_supervisor_summaries || that_present_supervisor_summaries) {
      if (!(this_present_supervisor_summaries && that_present_supervisor_summaries))
        return false;
      if (!this.supervisor_summaries.equals(that.supervisor_summaries))
        return false;
    }

    boolean this_present_worker_summaries = true && this.is_set_worker_summaries();
    boolean that_present_worker_summaries = true && that.is_set_worker_summaries();
    if (this_present_worker_summaries || that_present_worker_summaries) {
      if (!(this_present_worker_summaries && that_present_worker_summaries))
        return false;
      if (!this.worker_summaries.equals(that.worker_summaries))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_supervisor_summaries = true && (is_set_supervisor_summaries());
    list.add(present_supervisor_summaries);
    if (present_supervisor_summaries)
      list.add(supervisor_summaries);

    boolean present_worker_summaries = true && (is_set_worker_summaries());
    list.add(present_worker_summaries);
    if (present_worker_summaries)
      list.add(worker_summaries);

    return list.hashCode();
  }

  @Override
  public int compareTo(SupervisorPageInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_supervisor_summaries()).compareTo(other.is_set_supervisor_summaries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_supervisor_summaries()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.supervisor_summaries, other.supervisor_summaries);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_worker_summaries()).compareTo(other.is_set_worker_summaries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_worker_summaries()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.worker_summaries, other.worker_summaries);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SupervisorPageInfo(");
    boolean first = true;

    if (is_set_supervisor_summaries()) {
      sb.append("supervisor_summaries:");
      if (this.supervisor_summaries == null) {
        sb.append("null");
      } else {
        sb.append(this.supervisor_summaries);
      }
      first = false;
    }
    if (is_set_worker_summaries()) {
      if (!first) sb.append(", ");
      sb.append("worker_summaries:");
      if (this.worker_summaries == null) {
        sb.append("null");
      } else {
        sb.append(this.worker_summaries);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SupervisorPageInfoStandardSchemeFactory implements SchemeFactory {
    public SupervisorPageInfoStandardScheme getScheme() {
      return new SupervisorPageInfoStandardScheme();
    }
  }

  private static class SupervisorPageInfoStandardScheme extends StandardScheme<SupervisorPageInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SupervisorPageInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUPERVISOR_SUMMARIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list428 = iprot.readListBegin();
                struct.supervisor_summaries = new ArrayList<SupervisorSummary>(_list428.size);
                SupervisorSummary _elem429;
                for (int _i430 = 0; _i430 < _list428.size; ++_i430)
                {
                  _elem429 = new SupervisorSummary();
                  _elem429.read(iprot);
                  struct.supervisor_summaries.add(_elem429);
                }
                iprot.readListEnd();
              }
              struct.set_supervisor_summaries_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WORKER_SUMMARIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list431 = iprot.readListBegin();
                struct.worker_summaries = new ArrayList<WorkerSummary>(_list431.size);
                WorkerSummary _elem432;
                for (int _i433 = 0; _i433 < _list431.size; ++_i433)
                {
                  _elem432 = new WorkerSummary();
                  _elem432.read(iprot);
                  struct.worker_summaries.add(_elem432);
                }
                iprot.readListEnd();
              }
              struct.set_worker_summaries_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SupervisorPageInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.supervisor_summaries != null) {
        if (struct.is_set_supervisor_summaries()) {
          oprot.writeFieldBegin(SUPERVISOR_SUMMARIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.supervisor_summaries.size()));
            for (SupervisorSummary _iter434 : struct.supervisor_summaries)
            {
              _iter434.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.worker_summaries != null) {
        if (struct.is_set_worker_summaries()) {
          oprot.writeFieldBegin(WORKER_SUMMARIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.worker_summaries.size()));
            for (WorkerSummary _iter435 : struct.worker_summaries)
            {
              _iter435.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SupervisorPageInfoTupleSchemeFactory implements SchemeFactory {
    public SupervisorPageInfoTupleScheme getScheme() {
      return new SupervisorPageInfoTupleScheme();
    }
  }

  private static class SupervisorPageInfoTupleScheme extends TupleScheme<SupervisorPageInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SupervisorPageInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.is_set_supervisor_summaries()) {
        optionals.set(0);
      }
      if (struct.is_set_worker_summaries()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.is_set_supervisor_summaries()) {
        {
          oprot.writeI32(struct.supervisor_summaries.size());
          for (SupervisorSummary _iter436 : struct.supervisor_summaries)
          {
            _iter436.write(oprot);
          }
        }
      }
      if (struct.is_set_worker_summaries()) {
        {
          oprot.writeI32(struct.worker_summaries.size());
          for (WorkerSummary _iter437 : struct.worker_summaries)
          {
            _iter437.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SupervisorPageInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list438 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.supervisor_summaries = new ArrayList<SupervisorSummary>(_list438.size);
          SupervisorSummary _elem439;
          for (int _i440 = 0; _i440 < _list438.size; ++_i440)
          {
            _elem439 = new SupervisorSummary();
            _elem439.read(iprot);
            struct.supervisor_summaries.add(_elem439);
          }
        }
        struct.set_supervisor_summaries_isSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list441 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.worker_summaries = new ArrayList<WorkerSummary>(_list441.size);
          WorkerSummary _elem442;
          for (int _i443 = 0; _i443 < _list441.size; ++_i443)
          {
            _elem442 = new WorkerSummary();
            _elem442.read(iprot);
            struct.worker_summaries.add(_elem442);
          }
        }
        struct.set_worker_summaries_isSet(true);
      }
    }
  }

}

