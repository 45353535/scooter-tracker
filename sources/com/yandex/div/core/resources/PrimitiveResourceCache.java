package com.yandex.div.core.resources;

import android.content.res.Resources;
import android.util.TypedValue;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/div/core/resources/PrimitiveResourceCache;", "Lcom/yandex/div/core/resources/ResourcesWrapper;", "Landroid/content/res/Resources;", "baseResources", "<init>", "(Landroid/content/res/Resources;)V", "Landroid/util/TypedValue;", "obtainTempTypedValue", "()Landroid/util/TypedValue;", "value", "", "releaseTempTypedValue", "(Landroid/util/TypedValue;)V", "", "id", "", "getBoolean", "(I)Z", "", "getDimension", "(I)F", "getDimensionPixelOffset", "(I)I", "getDimensionPixelSize", "getInteger", "j$/util/concurrent/ConcurrentHashMap", "booleans", "Lj$/util/concurrent/ConcurrentHashMap;", "dimensions", "dimensionPixelOffsets", "dimensionPixelSizes", "integers", "tmpValue", "Landroid/util/TypedValue;", "Ljava/lang/Object;", "tmpValueLock", "Ljava/lang/Object;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PrimitiveResourceCache extends ResourcesWrapper {

    @NotNull
    private final ConcurrentHashMap<Integer, Boolean> booleans;

    @NotNull
    private final ConcurrentHashMap<Integer, Integer> dimensionPixelOffsets;

    @NotNull
    private final ConcurrentHashMap<Integer, Integer> dimensionPixelSizes;

    @NotNull
    private final ConcurrentHashMap<Integer, Float> dimensions;

    @NotNull
    private final ConcurrentHashMap<Integer, Integer> integers;

    @Nullable
    private TypedValue tmpValue;

    @NotNull
    private final Object tmpValueLock;

    public PrimitiveResourceCache(@NotNull Resources resources) {
        super(resources);
        this.booleans = new ConcurrentHashMap<>();
        this.dimensions = new ConcurrentHashMap<>();
        this.dimensionPixelOffsets = new ConcurrentHashMap<>();
        this.dimensionPixelSizes = new ConcurrentHashMap<>();
        this.integers = new ConcurrentHashMap<>();
        this.tmpValue = new TypedValue();
        this.tmpValueLock = new Object();
    }

    private final TypedValue obtainTempTypedValue() {
        TypedValue typedValue;
        synchronized (this.tmpValueLock) {
            try {
                typedValue = this.tmpValue;
                if (typedValue != null) {
                    this.tmpValue = null;
                } else {
                    typedValue = null;
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return typedValue == null ? new TypedValue() : typedValue;
    }

    private final void releaseTempTypedValue(TypedValue value) {
        synchronized (this.tmpValueLock) {
            try {
                if (this.tmpValue == null) {
                    this.tmpValue = value;
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int id2) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.booleans;
        Boolean bool = concurrentHashMap.get(Integer.valueOf(id2));
        if (bool == null) {
            TypedValue typedValueObtainTempTypedValue = obtainTempTypedValue();
            boolean z10 = true;
            try {
                super.getValue(id2, typedValueObtainTempTypedValue, true);
                int i10 = typedValueObtainTempTypedValue.type;
                if (i10 < 16 || i10 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(id2) + " type #0x" + Integer.toHexString(typedValueObtainTempTypedValue.type) + " is not valid");
                }
                if (typedValueObtainTempTypedValue.data == 0) {
                    z10 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z10);
                if (typedValueObtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(id2), boolValueOf);
                }
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                bool = boolValueOf;
            } catch (Throwable th2) {
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                throw th2;
            }
        }
        return bool.booleanValue();
    }

    @Override // android.content.res.Resources
    public float getDimension(int id2) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Float> concurrentHashMap = this.dimensions;
        Float f10 = concurrentHashMap.get(Integer.valueOf(id2));
        if (f10 == null) {
            TypedValue typedValueObtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(id2, typedValueObtainTempTypedValue, true);
                if (typedValueObtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(id2) + " type #0x" + Integer.toHexString(typedValueObtainTempTypedValue.type) + " is not valid");
                }
                Float fValueOf = Float.valueOf(TypedValue.complexToDimension(typedValueObtainTempTypedValue.data, getDisplayMetrics()));
                if (typedValueObtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(id2), fValueOf);
                }
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                f10 = fValueOf;
            } catch (Throwable th2) {
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                throw th2;
            }
        }
        return f10.floatValue();
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int id2) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.dimensionPixelOffsets;
        Integer num = concurrentHashMap.get(Integer.valueOf(id2));
        if (num == null) {
            TypedValue typedValueObtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(id2, typedValueObtainTempTypedValue, true);
                if (typedValueObtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(id2) + " type #0x" + Integer.toHexString(typedValueObtainTempTypedValue.type) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(TypedValue.complexToDimensionPixelOffset(typedValueObtainTempTypedValue.data, getDisplayMetrics()));
                if (typedValueObtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(id2), numValueOf);
                }
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                num = numValueOf;
            } catch (Throwable th2) {
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                throw th2;
            }
        }
        return num.intValue();
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int id2) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.dimensionPixelSizes;
        Integer num = concurrentHashMap.get(Integer.valueOf(id2));
        if (num == null) {
            TypedValue typedValueObtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(id2, typedValueObtainTempTypedValue, true);
                if (typedValueObtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(id2) + " type #0x" + Integer.toHexString(typedValueObtainTempTypedValue.type) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(TypedValue.complexToDimensionPixelSize(typedValueObtainTempTypedValue.data, getDisplayMetrics()));
                if (typedValueObtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(id2), numValueOf);
                }
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                num = numValueOf;
            } catch (Throwable th2) {
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                throw th2;
            }
        }
        return num.intValue();
    }

    @Override // android.content.res.Resources
    public int getInteger(int id2) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.integers;
        Integer num = concurrentHashMap.get(Integer.valueOf(id2));
        if (num == null) {
            TypedValue typedValueObtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(id2, typedValueObtainTempTypedValue, true);
                int i10 = typedValueObtainTempTypedValue.type;
                if (i10 < 16 || i10 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(id2) + " type #0x" + Integer.toHexString(typedValueObtainTempTypedValue.type) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(typedValueObtainTempTypedValue.data);
                if (typedValueObtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(id2), numValueOf);
                }
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                num = numValueOf;
            } catch (Throwable th2) {
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                throw th2;
            }
        }
        return num.intValue();
    }
}
