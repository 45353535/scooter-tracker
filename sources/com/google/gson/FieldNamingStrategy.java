package com.google.gson;

import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface FieldNamingStrategy {
    List<String> alternateNames(Field field);

    String translateName(Field field);
}
