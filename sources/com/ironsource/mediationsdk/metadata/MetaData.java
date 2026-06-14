package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MetaData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f44099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MetaDataValueTypes> f44100c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f44098a = str;
        this.f44099b = list;
        this.f44100c = list2;
    }

    public String getMetaDataKey() {
        return this.f44098a;
    }

    public List<String> getMetaDataValue() {
        return this.f44099b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f44100c;
    }

    public MetaData(String str, List<String> list) {
        this.f44098a = str;
        this.f44099b = list;
        this.f44100c = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f44100c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }
}
