package com.adjust.sdk.purchase;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public class ADJPVerificationPackage {
    private OnADJPVerificationFinished callback;
    private HashMap<String, String> parameters;

    public ADJPVerificationPackage(HashMap<String, String> map, OnADJPVerificationFinished onADJPVerificationFinished) {
        this.callback = onADJPVerificationFinished;
        this.parameters = map;
    }

    public OnADJPVerificationFinished getCallback() {
        return this.callback;
    }

    public String getExtendedString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.parameters != null) {
            sb2.append("Purchase verification request parameters:");
            for (Map.Entry entry : new TreeMap(this.parameters).entrySet()) {
                sb2.append(String.format(Locale.US, "\n\t%-16s %s", entry.getKey(), entry.getValue()));
            }
        }
        return sb2.toString();
    }

    public HashMap<String, String> getParameters() {
        return this.parameters;
    }
}
