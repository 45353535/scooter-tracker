package com.explorestack.protobuf;

import com.explorestack.protobuf.v0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
interface u1 {
    void a(List list, x1 x1Var, w wVar);

    void b(Map map, v0.b bVar, w wVar);

    Object c(x1 x1Var, w wVar);

    void d(List list, x1 x1Var, w wVar);

    Object e(x1 x1Var, w wVar);

    int getFieldNumber();

    int getTag();

    boolean readBool();

    void readBoolList(List list);

    ByteString readBytes();

    void readBytesList(List list);

    double readDouble();

    void readDoubleList(List list);

    int readEnum();

    void readEnumList(List list);

    int readFixed32();

    void readFixed32List(List list);

    long readFixed64();

    void readFixed64List(List list);

    float readFloat();

    void readFloatList(List list);

    int readInt32();

    void readInt32List(List list);

    long readInt64();

    void readInt64List(List list);

    int readSFixed32();

    void readSFixed32List(List list);

    long readSFixed64();

    void readSFixed64List(List list);

    int readSInt32();

    void readSInt32List(List list);

    long readSInt64();

    void readSInt64List(List list);

    String readString();

    void readStringList(List list);

    void readStringListRequireUtf8(List list);

    String readStringRequireUtf8();

    int readUInt32();

    void readUInt32List(List list);

    long readUInt64();

    void readUInt64List(List list);

    boolean skipField();
}
