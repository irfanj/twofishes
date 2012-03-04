/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.foursquare.geocoder;

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

// No additional import required for struct/union.

public class GeocodeFeature implements TBase<GeocodeFeature, GeocodeFeature._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("GeocodeFeature");

  private static final TField CENTER_FIELD_DESC = new TField("center", TType.STRUCT, (short)1);
  private static final TField CC_FIELD_DESC = new TField("cc", TType.STRING, (short)2);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)3);
  private static final TField ADMIN1_FIELD_DESC = new TField("admin1", TType.STRING, (short)4);
  private static final TField ADMIN2_FIELD_DESC = new TField("admin2", TType.STRING, (short)5);
  private static final TField ADMIN3_FIELD_DESC = new TField("admin3", TType.STRING, (short)6);
  private static final TField ADMIN4_FIELD_DESC = new TField("admin4", TType.STRING, (short)7);
  private static final TField DISPLAY_NAME_FIELD_DESC = new TField("displayName", TType.STRING, (short)8);
  private static final TField WOE_TYPE_FIELD_DESC = new TField("woeType", TType.I32, (short)9);

  public GeocodePoint center;
  public String cc;
  public String name;
  public String admin1;
  public String admin2;
  public String admin3;
  public String admin4;
  public String displayName;
  public int woeType;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    CENTER((short)1, "center"),
    CC((short)2, "cc"),
    NAME((short)3, "name"),
    ADMIN1((short)4, "admin1"),
    ADMIN2((short)5, "admin2"),
    ADMIN3((short)6, "admin3"),
    ADMIN4((short)7, "admin4"),
    DISPLAY_NAME((short)8, "displayName"),
    WOE_TYPE((short)9, "woeType");

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
        case 1: // CENTER
          return CENTER;
        case 2: // CC
          return CC;
        case 3: // NAME
          return NAME;
        case 4: // ADMIN1
          return ADMIN1;
        case 5: // ADMIN2
          return ADMIN2;
        case 6: // ADMIN3
          return ADMIN3;
        case 7: // ADMIN4
          return ADMIN4;
        case 8: // DISPLAY_NAME
          return DISPLAY_NAME;
        case 9: // WOE_TYPE
          return WOE_TYPE;
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
  private static final int __WOETYPE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CENTER, new FieldMetaData("center", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, GeocodePoint.class)));
    tmpMap.put(_Fields.CC, new FieldMetaData("cc", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.ADMIN1, new FieldMetaData("admin1", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.ADMIN2, new FieldMetaData("admin2", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.ADMIN3, new FieldMetaData("admin3", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.ADMIN4, new FieldMetaData("admin4", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_NAME, new FieldMetaData("displayName", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.WOE_TYPE, new FieldMetaData("woeType", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(GeocodeFeature.class, metaDataMap);
  }

  public GeocodeFeature() {
  }

  public GeocodeFeature(
    GeocodePoint center,
    String cc)
  {
    this();
    this.center = center;
    this.cc = cc;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GeocodeFeature(GeocodeFeature other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetCenter()) {
      this.center = new GeocodePoint(other.center);
    }
    if (other.isSetCc()) {
      this.cc = other.cc;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetAdmin1()) {
      this.admin1 = other.admin1;
    }
    if (other.isSetAdmin2()) {
      this.admin2 = other.admin2;
    }
    if (other.isSetAdmin3()) {
      this.admin3 = other.admin3;
    }
    if (other.isSetAdmin4()) {
      this.admin4 = other.admin4;
    }
    if (other.isSetDisplayName()) {
      this.displayName = other.displayName;
    }
    this.woeType = other.woeType;
  }

  public GeocodeFeature deepCopy() {
    return new GeocodeFeature(this);
  }

  @Override
  public void clear() {
    this.center = null;
    this.cc = null;
    this.name = null;
    this.admin1 = null;
    this.admin2 = null;
    this.admin3 = null;
    this.admin4 = null;
    this.displayName = null;
    setWoeTypeIsSet(false);
    this.woeType = 0;
  }

  public GeocodePoint getCenter() {
    return this.center;
  }

  public GeocodeFeature setCenter(GeocodePoint center) {
    this.center = center;
    return this;
  }

  public void unsetCenter() {
    this.center = null;
  }

  /** Returns true if field center is set (has been asigned a value) and false otherwise */
  public boolean isSetCenter() {
    return this.center != null;
  }

  public void setCenterIsSet(boolean value) {
    if (!value) {
      this.center = null;
    }
  }

  public String getCc() {
    return this.cc;
  }

  public GeocodeFeature setCc(String cc) {
    this.cc = cc;
    return this;
  }

  public void unsetCc() {
    this.cc = null;
  }

  /** Returns true if field cc is set (has been asigned a value) and false otherwise */
  public boolean isSetCc() {
    return this.cc != null;
  }

  public void setCcIsSet(boolean value) {
    if (!value) {
      this.cc = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public GeocodeFeature setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getAdmin1() {
    return this.admin1;
  }

  public GeocodeFeature setAdmin1(String admin1) {
    this.admin1 = admin1;
    return this;
  }

  public void unsetAdmin1() {
    this.admin1 = null;
  }

  /** Returns true if field admin1 is set (has been asigned a value) and false otherwise */
  public boolean isSetAdmin1() {
    return this.admin1 != null;
  }

  public void setAdmin1IsSet(boolean value) {
    if (!value) {
      this.admin1 = null;
    }
  }

  public String getAdmin2() {
    return this.admin2;
  }

  public GeocodeFeature setAdmin2(String admin2) {
    this.admin2 = admin2;
    return this;
  }

  public void unsetAdmin2() {
    this.admin2 = null;
  }

  /** Returns true if field admin2 is set (has been asigned a value) and false otherwise */
  public boolean isSetAdmin2() {
    return this.admin2 != null;
  }

  public void setAdmin2IsSet(boolean value) {
    if (!value) {
      this.admin2 = null;
    }
  }

  public String getAdmin3() {
    return this.admin3;
  }

  public GeocodeFeature setAdmin3(String admin3) {
    this.admin3 = admin3;
    return this;
  }

  public void unsetAdmin3() {
    this.admin3 = null;
  }

  /** Returns true if field admin3 is set (has been asigned a value) and false otherwise */
  public boolean isSetAdmin3() {
    return this.admin3 != null;
  }

  public void setAdmin3IsSet(boolean value) {
    if (!value) {
      this.admin3 = null;
    }
  }

  public String getAdmin4() {
    return this.admin4;
  }

  public GeocodeFeature setAdmin4(String admin4) {
    this.admin4 = admin4;
    return this;
  }

  public void unsetAdmin4() {
    this.admin4 = null;
  }

  /** Returns true if field admin4 is set (has been asigned a value) and false otherwise */
  public boolean isSetAdmin4() {
    return this.admin4 != null;
  }

  public void setAdmin4IsSet(boolean value) {
    if (!value) {
      this.admin4 = null;
    }
  }

  public String getDisplayName() {
    return this.displayName;
  }

  public GeocodeFeature setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public void unsetDisplayName() {
    this.displayName = null;
  }

  /** Returns true if field displayName is set (has been asigned a value) and false otherwise */
  public boolean isSetDisplayName() {
    return this.displayName != null;
  }

  public void setDisplayNameIsSet(boolean value) {
    if (!value) {
      this.displayName = null;
    }
  }

  public int getWoeType() {
    return this.woeType;
  }

  public GeocodeFeature setWoeType(int woeType) {
    this.woeType = woeType;
    setWoeTypeIsSet(true);
    return this;
  }

  public void unsetWoeType() {
    __isset_bit_vector.clear(__WOETYPE_ISSET_ID);
  }

  /** Returns true if field woeType is set (has been asigned a value) and false otherwise */
  public boolean isSetWoeType() {
    return __isset_bit_vector.get(__WOETYPE_ISSET_ID);
  }

  public void setWoeTypeIsSet(boolean value) {
    __isset_bit_vector.set(__WOETYPE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CENTER:
      if (value == null) {
        unsetCenter();
      } else {
        setCenter((GeocodePoint)value);
      }
      break;

    case CC:
      if (value == null) {
        unsetCc();
      } else {
        setCc((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case ADMIN1:
      if (value == null) {
        unsetAdmin1();
      } else {
        setAdmin1((String)value);
      }
      break;

    case ADMIN2:
      if (value == null) {
        unsetAdmin2();
      } else {
        setAdmin2((String)value);
      }
      break;

    case ADMIN3:
      if (value == null) {
        unsetAdmin3();
      } else {
        setAdmin3((String)value);
      }
      break;

    case ADMIN4:
      if (value == null) {
        unsetAdmin4();
      } else {
        setAdmin4((String)value);
      }
      break;

    case DISPLAY_NAME:
      if (value == null) {
        unsetDisplayName();
      } else {
        setDisplayName((String)value);
      }
      break;

    case WOE_TYPE:
      if (value == null) {
        unsetWoeType();
      } else {
        setWoeType((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CENTER:
      return getCenter();

    case CC:
      return getCc();

    case NAME:
      return getName();

    case ADMIN1:
      return getAdmin1();

    case ADMIN2:
      return getAdmin2();

    case ADMIN3:
      return getAdmin3();

    case ADMIN4:
      return getAdmin4();

    case DISPLAY_NAME:
      return getDisplayName();

    case WOE_TYPE:
      return new Integer(getWoeType());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CENTER:
      return isSetCenter();
    case CC:
      return isSetCc();
    case NAME:
      return isSetName();
    case ADMIN1:
      return isSetAdmin1();
    case ADMIN2:
      return isSetAdmin2();
    case ADMIN3:
      return isSetAdmin3();
    case ADMIN4:
      return isSetAdmin4();
    case DISPLAY_NAME:
      return isSetDisplayName();
    case WOE_TYPE:
      return isSetWoeType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GeocodeFeature)
      return this.equals((GeocodeFeature)that);
    return false;
  }

  public boolean equals(GeocodeFeature that) {
    if (that == null)
      return false;

    boolean this_present_center = true && this.isSetCenter();
    boolean that_present_center = true && that.isSetCenter();
    if (this_present_center || that_present_center) {
      if (!(this_present_center && that_present_center))
        return false;
      if (!this.center.equals(that.center))
        return false;
    }

    boolean this_present_cc = true && this.isSetCc();
    boolean that_present_cc = true && that.isSetCc();
    if (this_present_cc || that_present_cc) {
      if (!(this_present_cc && that_present_cc))
        return false;
      if (!this.cc.equals(that.cc))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_admin1 = true && this.isSetAdmin1();
    boolean that_present_admin1 = true && that.isSetAdmin1();
    if (this_present_admin1 || that_present_admin1) {
      if (!(this_present_admin1 && that_present_admin1))
        return false;
      if (!this.admin1.equals(that.admin1))
        return false;
    }

    boolean this_present_admin2 = true && this.isSetAdmin2();
    boolean that_present_admin2 = true && that.isSetAdmin2();
    if (this_present_admin2 || that_present_admin2) {
      if (!(this_present_admin2 && that_present_admin2))
        return false;
      if (!this.admin2.equals(that.admin2))
        return false;
    }

    boolean this_present_admin3 = true && this.isSetAdmin3();
    boolean that_present_admin3 = true && that.isSetAdmin3();
    if (this_present_admin3 || that_present_admin3) {
      if (!(this_present_admin3 && that_present_admin3))
        return false;
      if (!this.admin3.equals(that.admin3))
        return false;
    }

    boolean this_present_admin4 = true && this.isSetAdmin4();
    boolean that_present_admin4 = true && that.isSetAdmin4();
    if (this_present_admin4 || that_present_admin4) {
      if (!(this_present_admin4 && that_present_admin4))
        return false;
      if (!this.admin4.equals(that.admin4))
        return false;
    }

    boolean this_present_displayName = true && this.isSetDisplayName();
    boolean that_present_displayName = true && that.isSetDisplayName();
    if (this_present_displayName || that_present_displayName) {
      if (!(this_present_displayName && that_present_displayName))
        return false;
      if (!this.displayName.equals(that.displayName))
        return false;
    }

    boolean this_present_woeType = true && this.isSetWoeType();
    boolean that_present_woeType = true && that.isSetWoeType();
    if (this_present_woeType || that_present_woeType) {
      if (!(this_present_woeType && that_present_woeType))
        return false;
      if (this.woeType != that.woeType)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(GeocodeFeature other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    GeocodeFeature typedOther = (GeocodeFeature)other;

    lastComparison = Boolean.valueOf(isSetCenter()).compareTo(typedOther.isSetCenter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCenter()) {
      lastComparison = TBaseHelper.compareTo(this.center, typedOther.center);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCc()).compareTo(typedOther.isSetCc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCc()) {
      lastComparison = TBaseHelper.compareTo(this.cc, typedOther.cc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdmin1()).compareTo(typedOther.isSetAdmin1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdmin1()) {
      lastComparison = TBaseHelper.compareTo(this.admin1, typedOther.admin1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdmin2()).compareTo(typedOther.isSetAdmin2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdmin2()) {
      lastComparison = TBaseHelper.compareTo(this.admin2, typedOther.admin2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdmin3()).compareTo(typedOther.isSetAdmin3());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdmin3()) {
      lastComparison = TBaseHelper.compareTo(this.admin3, typedOther.admin3);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdmin4()).compareTo(typedOther.isSetAdmin4());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdmin4()) {
      lastComparison = TBaseHelper.compareTo(this.admin4, typedOther.admin4);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisplayName()).compareTo(typedOther.isSetDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayName()) {
      lastComparison = TBaseHelper.compareTo(this.displayName, typedOther.displayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWoeType()).compareTo(typedOther.isSetWoeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWoeType()) {
      lastComparison = TBaseHelper.compareTo(this.woeType, typedOther.woeType);
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
        case 1: // CENTER
          if (field.type == TType.STRUCT) {
            this.center = new GeocodePoint();
            this.center.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CC
          if (field.type == TType.STRING) {
            this.cc = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // ADMIN1
          if (field.type == TType.STRING) {
            this.admin1 = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // ADMIN2
          if (field.type == TType.STRING) {
            this.admin2 = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // ADMIN3
          if (field.type == TType.STRING) {
            this.admin3 = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // ADMIN4
          if (field.type == TType.STRING) {
            this.admin4 = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // DISPLAY_NAME
          if (field.type == TType.STRING) {
            this.displayName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // WOE_TYPE
          if (field.type == TType.I32) {
            this.woeType = iprot.readI32();
            setWoeTypeIsSet(true);
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
    if (this.center != null) {
      oprot.writeFieldBegin(CENTER_FIELD_DESC);
      this.center.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.cc != null) {
      oprot.writeFieldBegin(CC_FIELD_DESC);
      oprot.writeString(this.cc);
      oprot.writeFieldEnd();
    }
    if (this.name != null) {
      if (isSetName()) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(this.name);
        oprot.writeFieldEnd();
      }
    }
    if (this.admin1 != null) {
      if (isSetAdmin1()) {
        oprot.writeFieldBegin(ADMIN1_FIELD_DESC);
        oprot.writeString(this.admin1);
        oprot.writeFieldEnd();
      }
    }
    if (this.admin2 != null) {
      if (isSetAdmin2()) {
        oprot.writeFieldBegin(ADMIN2_FIELD_DESC);
        oprot.writeString(this.admin2);
        oprot.writeFieldEnd();
      }
    }
    if (this.admin3 != null) {
      if (isSetAdmin3()) {
        oprot.writeFieldBegin(ADMIN3_FIELD_DESC);
        oprot.writeString(this.admin3);
        oprot.writeFieldEnd();
      }
    }
    if (this.admin4 != null) {
      if (isSetAdmin4()) {
        oprot.writeFieldBegin(ADMIN4_FIELD_DESC);
        oprot.writeString(this.admin4);
        oprot.writeFieldEnd();
      }
    }
    if (this.displayName != null) {
      if (isSetDisplayName()) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(this.displayName);
        oprot.writeFieldEnd();
      }
    }
    if (isSetWoeType()) {
      oprot.writeFieldBegin(WOE_TYPE_FIELD_DESC);
      oprot.writeI32(this.woeType);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GeocodeFeature(");
    boolean first = true;

    sb.append("center:");
    if (this.center == null) {
      sb.append("null");
    } else {
      sb.append(this.center);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cc:");
    if (this.cc == null) {
      sb.append("null");
    } else {
      sb.append(this.cc);
    }
    first = false;
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetAdmin1()) {
      if (!first) sb.append(", ");
      sb.append("admin1:");
      if (this.admin1 == null) {
        sb.append("null");
      } else {
        sb.append(this.admin1);
      }
      first = false;
    }
    if (isSetAdmin2()) {
      if (!first) sb.append(", ");
      sb.append("admin2:");
      if (this.admin2 == null) {
        sb.append("null");
      } else {
        sb.append(this.admin2);
      }
      first = false;
    }
    if (isSetAdmin3()) {
      if (!first) sb.append(", ");
      sb.append("admin3:");
      if (this.admin3 == null) {
        sb.append("null");
      } else {
        sb.append(this.admin3);
      }
      first = false;
    }
    if (isSetAdmin4()) {
      if (!first) sb.append(", ");
      sb.append("admin4:");
      if (this.admin4 == null) {
        sb.append("null");
      } else {
        sb.append(this.admin4);
      }
      first = false;
    }
    if (isSetDisplayName()) {
      if (!first) sb.append(", ");
      sb.append("displayName:");
      if (this.displayName == null) {
        sb.append("null");
      } else {
        sb.append(this.displayName);
      }
      first = false;
    }
    if (isSetWoeType()) {
      if (!first) sb.append(", ");
      sb.append("woeType:");
      sb.append(this.woeType);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

