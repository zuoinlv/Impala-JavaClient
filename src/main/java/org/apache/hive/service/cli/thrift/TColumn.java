/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.cli.thrift;

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
public class TColumn extends org.apache.thrift.TUnion<TColumn, TColumn._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TColumn");
  private static final org.apache.thrift.protocol.TField BOOL_COLUMN_FIELD_DESC = new org.apache.thrift.protocol.TField("boolColumn", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField BYTE_COLUMN_FIELD_DESC = new org.apache.thrift.protocol.TField("byteColumn", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField I16_COLUMN_FIELD_DESC = new org.apache.thrift.protocol.TField("i16Column", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField I32_COLUMN_FIELD_DESC = new org.apache.thrift.protocol.TField("i32Column", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField I64_COLUMN_FIELD_DESC = new org.apache.thrift.protocol.TField("i64Column", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField DOUBLE_COLUMN_FIELD_DESC = new org.apache.thrift.protocol.TField("doubleColumn", org.apache.thrift.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift.protocol.TField STRING_COLUMN_FIELD_DESC = new org.apache.thrift.protocol.TField("stringColumn", org.apache.thrift.protocol.TType.LIST, (short)7);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BOOL_COLUMN((short)1, "boolColumn"),
    BYTE_COLUMN((short)2, "byteColumn"),
    I16_COLUMN((short)3, "i16Column"),
    I32_COLUMN((short)4, "i32Column"),
    I64_COLUMN((short)5, "i64Column"),
    DOUBLE_COLUMN((short)6, "doubleColumn"),
    STRING_COLUMN((short)7, "stringColumn");

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
        case 1: // BOOL_COLUMN
          return BOOL_COLUMN;
        case 2: // BYTE_COLUMN
          return BYTE_COLUMN;
        case 3: // I16_COLUMN
          return I16_COLUMN;
        case 4: // I32_COLUMN
          return I32_COLUMN;
        case 5: // I64_COLUMN
          return I64_COLUMN;
        case 6: // DOUBLE_COLUMN
          return DOUBLE_COLUMN;
        case 7: // STRING_COLUMN
          return STRING_COLUMN;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BOOL_COLUMN, new org.apache.thrift.meta_data.FieldMetaData("boolColumn", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBoolValue.class))));
    tmpMap.put(_Fields.BYTE_COLUMN, new org.apache.thrift.meta_data.FieldMetaData("byteColumn", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TByteValue.class))));
    tmpMap.put(_Fields.I16_COLUMN, new org.apache.thrift.meta_data.FieldMetaData("i16Column", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TI16Value.class))));
    tmpMap.put(_Fields.I32_COLUMN, new org.apache.thrift.meta_data.FieldMetaData("i32Column", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TI32Value.class))));
    tmpMap.put(_Fields.I64_COLUMN, new org.apache.thrift.meta_data.FieldMetaData("i64Column", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TI64Value.class))));
    tmpMap.put(_Fields.DOUBLE_COLUMN, new org.apache.thrift.meta_data.FieldMetaData("doubleColumn", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDoubleValue.class))));
    tmpMap.put(_Fields.STRING_COLUMN, new org.apache.thrift.meta_data.FieldMetaData("stringColumn", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TStringValue.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TColumn.class, metaDataMap);
  }

  public TColumn() {
    super();
  }

  public TColumn(_Fields setField, Object value) {
    super(setField, value);
  }

  public TColumn(TColumn other) {
    super(other);
  }
  public TColumn deepCopy() {
    return new TColumn(this);
  }

  public static TColumn boolColumn(List<TBoolValue> value) {
    TColumn x = new TColumn();
    x.setBoolColumn(value);
    return x;
  }

  public static TColumn byteColumn(List<TByteValue> value) {
    TColumn x = new TColumn();
    x.setByteColumn(value);
    return x;
  }

  public static TColumn i16Column(List<TI16Value> value) {
    TColumn x = new TColumn();
    x.setI16Column(value);
    return x;
  }

  public static TColumn i32Column(List<TI32Value> value) {
    TColumn x = new TColumn();
    x.setI32Column(value);
    return x;
  }

  public static TColumn i64Column(List<TI64Value> value) {
    TColumn x = new TColumn();
    x.setI64Column(value);
    return x;
  }

  public static TColumn doubleColumn(List<TDoubleValue> value) {
    TColumn x = new TColumn();
    x.setDoubleColumn(value);
    return x;
  }

  public static TColumn stringColumn(List<TStringValue> value) {
    TColumn x = new TColumn();
    x.setStringColumn(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case BOOL_COLUMN:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<TBoolValue> for field 'boolColumn', but got " + value.getClass().getSimpleName());
      case BYTE_COLUMN:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<TByteValue> for field 'byteColumn', but got " + value.getClass().getSimpleName());
      case I16_COLUMN:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<TI16Value> for field 'i16Column', but got " + value.getClass().getSimpleName());
      case I32_COLUMN:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<TI32Value> for field 'i32Column', but got " + value.getClass().getSimpleName());
      case I64_COLUMN:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<TI64Value> for field 'i64Column', but got " + value.getClass().getSimpleName());
      case DOUBLE_COLUMN:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<TDoubleValue> for field 'doubleColumn', but got " + value.getClass().getSimpleName());
      case STRING_COLUMN:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<TStringValue> for field 'stringColumn', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case BOOL_COLUMN:
          if (field.type == BOOL_COLUMN_FIELD_DESC.type) {
            List<TBoolValue> boolColumn;
            {
              org.apache.thrift.protocol.TList _list36 = iprot.readListBegin();
              boolColumn = new ArrayList<TBoolValue>(_list36.size);
              TBoolValue _elem37;
              for (int _i38 = 0; _i38 < _list36.size; ++_i38)
              {
                _elem37 = new TBoolValue();
                _elem37.read(iprot);
                boolColumn.add(_elem37);
              }
              iprot.readListEnd();
            }
            return boolColumn;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case BYTE_COLUMN:
          if (field.type == BYTE_COLUMN_FIELD_DESC.type) {
            List<TByteValue> byteColumn;
            {
              org.apache.thrift.protocol.TList _list39 = iprot.readListBegin();
              byteColumn = new ArrayList<TByteValue>(_list39.size);
              TByteValue _elem40;
              for (int _i41 = 0; _i41 < _list39.size; ++_i41)
              {
                _elem40 = new TByteValue();
                _elem40.read(iprot);
                byteColumn.add(_elem40);
              }
              iprot.readListEnd();
            }
            return byteColumn;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case I16_COLUMN:
          if (field.type == I16_COLUMN_FIELD_DESC.type) {
            List<TI16Value> i16Column;
            {
              org.apache.thrift.protocol.TList _list42 = iprot.readListBegin();
              i16Column = new ArrayList<TI16Value>(_list42.size);
              TI16Value _elem43;
              for (int _i44 = 0; _i44 < _list42.size; ++_i44)
              {
                _elem43 = new TI16Value();
                _elem43.read(iprot);
                i16Column.add(_elem43);
              }
              iprot.readListEnd();
            }
            return i16Column;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case I32_COLUMN:
          if (field.type == I32_COLUMN_FIELD_DESC.type) {
            List<TI32Value> i32Column;
            {
              org.apache.thrift.protocol.TList _list45 = iprot.readListBegin();
              i32Column = new ArrayList<TI32Value>(_list45.size);
              TI32Value _elem46;
              for (int _i47 = 0; _i47 < _list45.size; ++_i47)
              {
                _elem46 = new TI32Value();
                _elem46.read(iprot);
                i32Column.add(_elem46);
              }
              iprot.readListEnd();
            }
            return i32Column;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case I64_COLUMN:
          if (field.type == I64_COLUMN_FIELD_DESC.type) {
            List<TI64Value> i64Column;
            {
              org.apache.thrift.protocol.TList _list48 = iprot.readListBegin();
              i64Column = new ArrayList<TI64Value>(_list48.size);
              TI64Value _elem49;
              for (int _i50 = 0; _i50 < _list48.size; ++_i50)
              {
                _elem49 = new TI64Value();
                _elem49.read(iprot);
                i64Column.add(_elem49);
              }
              iprot.readListEnd();
            }
            return i64Column;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DOUBLE_COLUMN:
          if (field.type == DOUBLE_COLUMN_FIELD_DESC.type) {
            List<TDoubleValue> doubleColumn;
            {
              org.apache.thrift.protocol.TList _list51 = iprot.readListBegin();
              doubleColumn = new ArrayList<TDoubleValue>(_list51.size);
              TDoubleValue _elem52;
              for (int _i53 = 0; _i53 < _list51.size; ++_i53)
              {
                _elem52 = new TDoubleValue();
                _elem52.read(iprot);
                doubleColumn.add(_elem52);
              }
              iprot.readListEnd();
            }
            return doubleColumn;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STRING_COLUMN:
          if (field.type == STRING_COLUMN_FIELD_DESC.type) {
            List<TStringValue> stringColumn;
            {
              org.apache.thrift.protocol.TList _list54 = iprot.readListBegin();
              stringColumn = new ArrayList<TStringValue>(_list54.size);
              TStringValue _elem55;
              for (int _i56 = 0; _i56 < _list54.size; ++_i56)
              {
                _elem55 = new TStringValue();
                _elem55.read(iprot);
                stringColumn.add(_elem55);
              }
              iprot.readListEnd();
            }
            return stringColumn;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case BOOL_COLUMN:
        List<TBoolValue> boolColumn = (List<TBoolValue>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, boolColumn.size()));
          for (TBoolValue _iter57 : boolColumn)
          {
            _iter57.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case BYTE_COLUMN:
        List<TByteValue> byteColumn = (List<TByteValue>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, byteColumn.size()));
          for (TByteValue _iter58 : byteColumn)
          {
            _iter58.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case I16_COLUMN:
        List<TI16Value> i16Column = (List<TI16Value>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, i16Column.size()));
          for (TI16Value _iter59 : i16Column)
          {
            _iter59.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case I32_COLUMN:
        List<TI32Value> i32Column = (List<TI32Value>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, i32Column.size()));
          for (TI32Value _iter60 : i32Column)
          {
            _iter60.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case I64_COLUMN:
        List<TI64Value> i64Column = (List<TI64Value>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, i64Column.size()));
          for (TI64Value _iter61 : i64Column)
          {
            _iter61.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case DOUBLE_COLUMN:
        List<TDoubleValue> doubleColumn = (List<TDoubleValue>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, doubleColumn.size()));
          for (TDoubleValue _iter62 : doubleColumn)
          {
            _iter62.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case STRING_COLUMN:
        List<TStringValue> stringColumn = (List<TStringValue>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, stringColumn.size()));
          for (TStringValue _iter63 : stringColumn)
          {
            _iter63.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case BOOL_COLUMN:
          List<TBoolValue> boolColumn;
          {
            org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
            boolColumn = new ArrayList<TBoolValue>(_list64.size);
            TBoolValue _elem65;
            for (int _i66 = 0; _i66 < _list64.size; ++_i66)
            {
              _elem65 = new TBoolValue();
              _elem65.read(iprot);
              boolColumn.add(_elem65);
            }
            iprot.readListEnd();
          }
          return boolColumn;
        case BYTE_COLUMN:
          List<TByteValue> byteColumn;
          {
            org.apache.thrift.protocol.TList _list67 = iprot.readListBegin();
            byteColumn = new ArrayList<TByteValue>(_list67.size);
            TByteValue _elem68;
            for (int _i69 = 0; _i69 < _list67.size; ++_i69)
            {
              _elem68 = new TByteValue();
              _elem68.read(iprot);
              byteColumn.add(_elem68);
            }
            iprot.readListEnd();
          }
          return byteColumn;
        case I16_COLUMN:
          List<TI16Value> i16Column;
          {
            org.apache.thrift.protocol.TList _list70 = iprot.readListBegin();
            i16Column = new ArrayList<TI16Value>(_list70.size);
            TI16Value _elem71;
            for (int _i72 = 0; _i72 < _list70.size; ++_i72)
            {
              _elem71 = new TI16Value();
              _elem71.read(iprot);
              i16Column.add(_elem71);
            }
            iprot.readListEnd();
          }
          return i16Column;
        case I32_COLUMN:
          List<TI32Value> i32Column;
          {
            org.apache.thrift.protocol.TList _list73 = iprot.readListBegin();
            i32Column = new ArrayList<TI32Value>(_list73.size);
            TI32Value _elem74;
            for (int _i75 = 0; _i75 < _list73.size; ++_i75)
            {
              _elem74 = new TI32Value();
              _elem74.read(iprot);
              i32Column.add(_elem74);
            }
            iprot.readListEnd();
          }
          return i32Column;
        case I64_COLUMN:
          List<TI64Value> i64Column;
          {
            org.apache.thrift.protocol.TList _list76 = iprot.readListBegin();
            i64Column = new ArrayList<TI64Value>(_list76.size);
            TI64Value _elem77;
            for (int _i78 = 0; _i78 < _list76.size; ++_i78)
            {
              _elem77 = new TI64Value();
              _elem77.read(iprot);
              i64Column.add(_elem77);
            }
            iprot.readListEnd();
          }
          return i64Column;
        case DOUBLE_COLUMN:
          List<TDoubleValue> doubleColumn;
          {
            org.apache.thrift.protocol.TList _list79 = iprot.readListBegin();
            doubleColumn = new ArrayList<TDoubleValue>(_list79.size);
            TDoubleValue _elem80;
            for (int _i81 = 0; _i81 < _list79.size; ++_i81)
            {
              _elem80 = new TDoubleValue();
              _elem80.read(iprot);
              doubleColumn.add(_elem80);
            }
            iprot.readListEnd();
          }
          return doubleColumn;
        case STRING_COLUMN:
          List<TStringValue> stringColumn;
          {
            org.apache.thrift.protocol.TList _list82 = iprot.readListBegin();
            stringColumn = new ArrayList<TStringValue>(_list82.size);
            TStringValue _elem83;
            for (int _i84 = 0; _i84 < _list82.size; ++_i84)
            {
              _elem83 = new TStringValue();
              _elem83.read(iprot);
              stringColumn.add(_elem83);
            }
            iprot.readListEnd();
          }
          return stringColumn;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case BOOL_COLUMN:
        List<TBoolValue> boolColumn = (List<TBoolValue>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, boolColumn.size()));
          for (TBoolValue _iter85 : boolColumn)
          {
            _iter85.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case BYTE_COLUMN:
        List<TByteValue> byteColumn = (List<TByteValue>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, byteColumn.size()));
          for (TByteValue _iter86 : byteColumn)
          {
            _iter86.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case I16_COLUMN:
        List<TI16Value> i16Column = (List<TI16Value>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, i16Column.size()));
          for (TI16Value _iter87 : i16Column)
          {
            _iter87.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case I32_COLUMN:
        List<TI32Value> i32Column = (List<TI32Value>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, i32Column.size()));
          for (TI32Value _iter88 : i32Column)
          {
            _iter88.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case I64_COLUMN:
        List<TI64Value> i64Column = (List<TI64Value>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, i64Column.size()));
          for (TI64Value _iter89 : i64Column)
          {
            _iter89.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case DOUBLE_COLUMN:
        List<TDoubleValue> doubleColumn = (List<TDoubleValue>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, doubleColumn.size()));
          for (TDoubleValue _iter90 : doubleColumn)
          {
            _iter90.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case STRING_COLUMN:
        List<TStringValue> stringColumn = (List<TStringValue>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, stringColumn.size()));
          for (TStringValue _iter91 : stringColumn)
          {
            _iter91.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case BOOL_COLUMN:
        return BOOL_COLUMN_FIELD_DESC;
      case BYTE_COLUMN:
        return BYTE_COLUMN_FIELD_DESC;
      case I16_COLUMN:
        return I16_COLUMN_FIELD_DESC;
      case I32_COLUMN:
        return I32_COLUMN_FIELD_DESC;
      case I64_COLUMN:
        return I64_COLUMN_FIELD_DESC;
      case DOUBLE_COLUMN:
        return DOUBLE_COLUMN_FIELD_DESC;
      case STRING_COLUMN:
        return STRING_COLUMN_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public List<TBoolValue> getBoolColumn() {
    if (getSetField() == _Fields.BOOL_COLUMN) {
      return (List<TBoolValue>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'boolColumn' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBoolColumn(List<TBoolValue> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.BOOL_COLUMN;
    value_ = value;
  }

  public List<TByteValue> getByteColumn() {
    if (getSetField() == _Fields.BYTE_COLUMN) {
      return (List<TByteValue>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'byteColumn' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setByteColumn(List<TByteValue> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.BYTE_COLUMN;
    value_ = value;
  }

  public List<TI16Value> getI16Column() {
    if (getSetField() == _Fields.I16_COLUMN) {
      return (List<TI16Value>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'i16Column' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setI16Column(List<TI16Value> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.I16_COLUMN;
    value_ = value;
  }

  public List<TI32Value> getI32Column() {
    if (getSetField() == _Fields.I32_COLUMN) {
      return (List<TI32Value>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'i32Column' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setI32Column(List<TI32Value> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.I32_COLUMN;
    value_ = value;
  }

  public List<TI64Value> getI64Column() {
    if (getSetField() == _Fields.I64_COLUMN) {
      return (List<TI64Value>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'i64Column' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setI64Column(List<TI64Value> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.I64_COLUMN;
    value_ = value;
  }

  public List<TDoubleValue> getDoubleColumn() {
    if (getSetField() == _Fields.DOUBLE_COLUMN) {
      return (List<TDoubleValue>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'doubleColumn' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDoubleColumn(List<TDoubleValue> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.DOUBLE_COLUMN;
    value_ = value;
  }

  public List<TStringValue> getStringColumn() {
    if (getSetField() == _Fields.STRING_COLUMN) {
      return (List<TStringValue>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'stringColumn' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStringColumn(List<TStringValue> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STRING_COLUMN;
    value_ = value;
  }

  public boolean isSetBoolColumn() {
    return setField_ == _Fields.BOOL_COLUMN;
  }


  public boolean isSetByteColumn() {
    return setField_ == _Fields.BYTE_COLUMN;
  }


  public boolean isSetI16Column() {
    return setField_ == _Fields.I16_COLUMN;
  }


  public boolean isSetI32Column() {
    return setField_ == _Fields.I32_COLUMN;
  }


  public boolean isSetI64Column() {
    return setField_ == _Fields.I64_COLUMN;
  }


  public boolean isSetDoubleColumn() {
    return setField_ == _Fields.DOUBLE_COLUMN;
  }


  public boolean isSetStringColumn() {
    return setField_ == _Fields.STRING_COLUMN;
  }


  public boolean equals(Object other) {
    if (other instanceof TColumn) {
      return equals((TColumn)other);
    } else {
      return false;
    }
  }

  public boolean equals(TColumn other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TColumn other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
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


}
