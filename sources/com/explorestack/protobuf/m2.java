package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f19230b = Logger.getLogger(m2.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19231a;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final m2 f19232a = new m2(Collections.EMPTY_MAP);
    }

    m2(Map map) {
        this.f19231a = map;
    }

    public static m2 c() {
        return a.f19232a;
    }

    private static String d(String str) throws InvalidProtocolBufferException {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length != 1) {
            return strArrSplit[strArrSplit.length - 1];
        }
        throw new InvalidProtocolBufferException("Invalid type url found: " + str);
    }

    public Descriptors.Descriptor a(String str) {
        return (Descriptors.Descriptor) this.f19231a.get(str);
    }

    public final Descriptors.Descriptor b(String str) {
        return a(d(str));
    }
}
