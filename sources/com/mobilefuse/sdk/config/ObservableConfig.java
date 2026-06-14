package com.mobilefuse.sdk.config;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class ObservableConfig {
    private Set<Observer> observers = new HashSet();
    private Map<ObservableConfigKey, Object> configMap = new HashMap();

    private void notifyChange(ObservableConfigKey observableConfigKey, Object obj) throws Throwable {
        Iterator it = new HashSet(this.observers).iterator();
        while (it.hasNext()) {
            ((Observer) it.next()).onChanged(observableConfigKey, obj);
        }
    }

    public void clearValue(ObservableConfigKey observableConfigKey) throws Throwable {
        if (this.configMap.containsKey(observableConfigKey)) {
            this.configMap.remove(observableConfigKey);
        }
    }

    public boolean getBooleanValue(ObservableConfigKey observableConfigKey) throws Throwable {
        return getBooleanValue(observableConfigKey, false);
    }

    public float getFloatValue(ObservableConfigKey observableConfigKey, float f10) throws Throwable {
        Object value = getValue(observableConfigKey);
        return !(value instanceof Float) ? f10 : ((Float) value).floatValue();
    }

    @Nullable
    public Float getFloatValueOrNull(ObservableConfigKey observableConfigKey) throws Throwable {
        Object value = getValue(observableConfigKey);
        if (!(value instanceof Float)) {
            return null;
        }
        Float f10 = (Float) value;
        f10.floatValue();
        return f10;
    }

    public int getIntValue(ObservableConfigKey observableConfigKey, int i10) throws Throwable {
        Object value = getValue(observableConfigKey);
        return !(value instanceof Integer) ? i10 : ((Integer) value).intValue();
    }

    public long getLongValue(ObservableConfigKey observableConfigKey, long j10) throws Throwable {
        Object value = getValue(observableConfigKey);
        return !(value instanceof Long) ? j10 : ((Long) value).longValue();
    }

    public Object getValue(ObservableConfigKey observableConfigKey) throws Throwable {
        return this.configMap.get(observableConfigKey);
    }

    public boolean hasValue(ObservableConfigKey observableConfigKey) throws Throwable {
        return this.configMap.containsKey(observableConfigKey);
    }

    public void registerObserver(Observer observer) throws Throwable {
        this.observers.add(observer);
    }

    public void setValue(ObservableConfigKey observableConfigKey, Object obj) throws Throwable {
        this.configMap.put(observableConfigKey, obj);
        notifyChange(observableConfigKey, obj);
    }

    public void unregisterAll() throws Throwable {
        this.observers.clear();
    }

    public void unregisterObserver(Observer observer) throws Throwable {
        this.observers.remove(observer);
    }

    public boolean getBooleanValue(ObservableConfigKey observableConfigKey, boolean z10) throws Throwable {
        Object value = getValue(observableConfigKey);
        return !(value instanceof Boolean) ? z10 : ((Boolean) value).booleanValue();
    }
}
