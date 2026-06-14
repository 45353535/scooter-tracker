package com.yandex.div.data;

import android.net.Uri;
import androidx.annotation.MainThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.core.ObserverList;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.util.ConvertUtilsKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import java.util.Iterator;
import k8.f;
import k8.hy;
import k8.p;
import k8.pz;
import k8.sy;
import k8.t0;
import k8.z;
import k8.zz;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b789:;<=>B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0012¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0004H\u0012¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0012¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0004H\u0012¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0013\u001a\u00020\u0011*\u00020\u0004H\u0012ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0004H\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0004H\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0004H\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 0\u001fH\u0016¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 0\u001fH\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0000H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0004H\u0017¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0000H\u0017¢\u0006\u0004\b,\u0010'J\u0017\u0010-\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0001H\u0017¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0017H\u0016¢\u0006\u0004\b/\u00100R&\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 0\u001f018\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0001\b?@ABCDEF\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006G"}, d2 = {"Lcom/yandex/div/data/Variable;", "", "<init>", "()V", "", "", "parseAsLong", "(Ljava/lang/String;)J", "", "parseAsInt", "(Ljava/lang/String;)I", "", "parseAsBoolean", "(Ljava/lang/String;)Z", "", "parseAsDouble", "(Ljava/lang/String;)D", "Lcom/yandex/div/evaluable/types/Color;", "parseAsColor-C4zCDoM", "parseAsColor", "Landroid/net/Uri;", "parseAsUri", "(Ljava/lang/String;)Landroid/net/Uri;", "Lorg/json/JSONObject;", "parseAsJsonObject", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lorg/json/JSONArray;", "parseAsJsonArray", "(Ljava/lang/String;)Lorg/json/JSONArray;", "getValue", "()Ljava/lang/Object;", "Lkotlin/Function1;", "", "observer", "addObserver", "(Lkotlin/jvm/functions/Function1;)V", "removeObserver", "v", "notifyVariableChanged", "(Lcom/yandex/div/data/Variable;)V", "newValue", "set", "(Ljava/lang/String;)V", TypedValues.TransitionType.S_FROM, "setValue", "setValueDirectly", "(Ljava/lang/Object;)V", "writeToJSON", "()Lorg/json/JSONObject;", "Lcom/yandex/div/core/ObserverList;", "observers", "Lcom/yandex/div/core/ObserverList;", "getName", "()Ljava/lang/String;", "name", "ArrayVariable", "BooleanVariable", "ColorVariable", "DictVariable", "DoubleVariable", "IntegerVariable", "StringVariable", "UrlVariable", "Lcom/yandex/div/data/Variable$ArrayVariable;", "Lcom/yandex/div/data/Variable$BooleanVariable;", "Lcom/yandex/div/data/Variable$ColorVariable;", "Lcom/yandex/div/data/Variable$DictVariable;", "Lcom/yandex/div/data/Variable$DoubleVariable;", "Lcom/yandex/div/data/Variable$IntegerVariable;", "Lcom/yandex/div/data/Variable$StringVariable;", "Lcom/yandex/div/data/Variable$UrlVariable;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Variable {

    @NotNull
    private final ObserverList<Function1<Variable, Unit>> observers;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/data/Variable$ArrayVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "Lorg/json/JSONArray;", "(Ljava/lang/String;Lorg/json/JSONArray;)V", "getDefaultValue", "()Lorg/json/JSONArray;", "getName", "()Ljava/lang/String;", "value", "getValue$div_data_release", "setValue$div_data_release", "(Lorg/json/JSONArray;)V", "set", "", "newValue", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class ArrayVariable extends Variable {

        @NotNull
        private final JSONArray defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private JSONArray value;

        public ArrayVariable(@NotNull String str, @NotNull JSONArray jSONArray) {
            super(null);
            this.name = str;
            this.defaultValue = jSONArray;
            this.value = getDefaultValue();
        }

        @NotNull
        public JSONArray getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: getValue$div_data_release, reason: from getter */
        public JSONArray getValue() {
            return this.value;
        }

        @MainThread
        public void set(@NotNull JSONArray newValue) {
            setValue$div_data_release(newValue);
        }

        public void setValue$div_data_release(@NotNull JSONArray jSONArray) {
            if (Intrinsics.areEqual(this.value, jSONArray)) {
                return;
            }
            this.value = jSONArray;
            notifyVariableChanged(this);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/data/Variable$BooleanVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "", "(Ljava/lang/String;Z)V", "getDefaultValue", "()Z", "getName", "()Ljava/lang/String;", "value", "getValue$div_data_release", "setValue$div_data_release", "(Z)V", "set", "", "newValue", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class BooleanVariable extends Variable {
        private final boolean defaultValue;

        @NotNull
        private final String name;
        private boolean value;

        public BooleanVariable(@NotNull String str, boolean z10) {
            super(null);
            this.name = str;
            this.defaultValue = z10;
            this.value = getDefaultValue();
        }

        public boolean getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: getValue$div_data_release, reason: from getter */
        public boolean getValue() {
            return this.value;
        }

        @MainThread
        public void set(boolean newValue) {
            setValue$div_data_release(newValue);
        }

        public void setValue$div_data_release(boolean z10) {
            if (this.value == z10) {
                return;
            }
            this.value = z10;
            notifyVariableChanged(this);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR/\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@PX\u0090\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/data/Variable$ColorVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "", "(Ljava/lang/String;I)V", "getDefaultValue", "()I", "getName", "()Ljava/lang/String;", "value", "Lcom/yandex/div/evaluable/types/Color;", "getValue-WpymAT4$div_data_release", "setValue-cIhhviA$div_data_release", "(I)V", "I", "set", "", "newValue", "set-cIhhviA", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class ColorVariable extends Variable {
        private final int defaultValue;

        @NotNull
        private final String name;
        private int value;

        public ColorVariable(@NotNull String str, int i10) {
            super(null);
            this.name = str;
            this.defaultValue = i10;
            this.value = Color.m7660constructorimpl(getDefaultValue());
        }

        public int getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: getValue-WpymAT4$div_data_release, reason: not valid java name and from getter */
        public int getValue() {
            return this.value;
        }

        @MainThread
        /* JADX INFO: renamed from: set-cIhhviA, reason: not valid java name */
        public void m7614setcIhhviA(int newValue) throws VariableMutationException {
            Integer numInvoke = ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(Color.m7659boximpl(newValue));
            if (numInvoke != null) {
                m7615setValuecIhhviA$div_data_release(Color.m7660constructorimpl(numInvoke.intValue()));
                return;
            }
            throw new VariableMutationException("Wrong value format for color variable: '" + ((Object) Color.m7666toStringimpl(newValue)) + '\'', null, 2, null);
        }

        /* JADX INFO: renamed from: setValue-cIhhviA$div_data_release, reason: not valid java name */
        public void m7615setValuecIhhviA$div_data_release(int i10) {
            if (Color.m7662equalsimpl0(this.value, i10)) {
                return;
            }
            this.value = i10;
            notifyVariableChanged(this);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/data/Variable$DictVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "Lorg/json/JSONObject;", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "getDefaultValue", "()Lorg/json/JSONObject;", "getName", "()Ljava/lang/String;", "value", "getValue$div_data_release", "setValue$div_data_release", "(Lorg/json/JSONObject;)V", "set", "", "newValue", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class DictVariable extends Variable {

        @NotNull
        private final JSONObject defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private JSONObject value;

        public DictVariable(@NotNull String str, @NotNull JSONObject jSONObject) {
            super(null);
            this.name = str;
            this.defaultValue = jSONObject;
            this.value = getDefaultValue();
        }

        @NotNull
        public JSONObject getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: getValue$div_data_release, reason: from getter */
        public JSONObject getValue() {
            return this.value;
        }

        @MainThread
        public void set(@NotNull JSONObject newValue) {
            setValue$div_data_release(newValue);
        }

        public void setValue$div_data_release(@NotNull JSONObject jSONObject) {
            if (Intrinsics.areEqual(this.value, jSONObject)) {
                return;
            }
            this.value = jSONObject;
            notifyVariableChanged(this);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/data/Variable$DoubleVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "", "(Ljava/lang/String;D)V", "getDefaultValue", "()D", "getName", "()Ljava/lang/String;", "value", "getValue$div_data_release", "setValue$div_data_release", "(D)V", "set", "", "newValue", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class DoubleVariable extends Variable {
        private final double defaultValue;

        @NotNull
        private final String name;
        private double value;

        public DoubleVariable(@NotNull String str, double d10) {
            super(null);
            this.name = str;
            this.defaultValue = d10;
            this.value = getDefaultValue();
        }

        public double getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: getValue$div_data_release, reason: from getter */
        public double getValue() {
            return this.value;
        }

        @MainThread
        public void set(double newValue) {
            setValue$div_data_release(newValue);
        }

        public void setValue$div_data_release(double d10) {
            if (this.value == d10) {
                return;
            }
            this.value = d10;
            notifyVariableChanged(this);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/data/Variable$IntegerVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "", "(Ljava/lang/String;J)V", "getDefaultValue", "()J", "getName", "()Ljava/lang/String;", "value", "getValue$div_data_release", "setValue$div_data_release", "(J)V", "set", "", "newValue", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class IntegerVariable extends Variable {
        private final long defaultValue;

        @NotNull
        private final String name;
        private long value;

        public IntegerVariable(@NotNull String str, long j10) {
            super(null);
            this.name = str;
            this.defaultValue = j10;
            this.value = getDefaultValue();
        }

        public long getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: getValue$div_data_release, reason: from getter */
        public long getValue() {
            return this.value;
        }

        @MainThread
        public void set(long newValue) {
            setValue$div_data_release(newValue);
        }

        public void setValue$div_data_release(long j10) {
            if (this.value == j10) {
                return;
            }
            this.value = j10;
            notifyVariableChanged(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R$\u0010\t\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/div/data/Variable$StringVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getDefaultValue", "()Ljava/lang/String;", "getName", "value", "getValue$div_data_release", "setValue$div_data_release", "(Ljava/lang/String;)V", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class StringVariable extends Variable {

        @NotNull
        private final String defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private String value;

        public StringVariable(@NotNull String str, @NotNull String str2) {
            super(null);
            this.name = str;
            this.defaultValue = str2;
            this.value = getDefaultValue();
        }

        @NotNull
        public String getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: getValue$div_data_release, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public void setValue$div_data_release(@NotNull String str) {
            if (Intrinsics.areEqual(this.value, str)) {
                return;
            }
            this.value = str;
            notifyVariableChanged(this);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/data/Variable$UrlVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "Landroid/net/Uri;", "(Ljava/lang/String;Landroid/net/Uri;)V", "getDefaultValue", "()Landroid/net/Uri;", "getName", "()Ljava/lang/String;", "value", "getValue$div_data_release", "setValue$div_data_release", "(Landroid/net/Uri;)V", "set", "", "newValue", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class UrlVariable extends Variable {

        @NotNull
        private final Uri defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private Uri value;

        public UrlVariable(@NotNull String str, @NotNull Uri uri) {
            super(null);
            this.name = str;
            this.defaultValue = uri;
            this.value = getDefaultValue();
        }

        @NotNull
        public Uri getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: getValue$div_data_release, reason: from getter */
        public Uri getValue() {
            return this.value;
        }

        @MainThread
        public void set(@NotNull Uri newValue) {
            setValue$div_data_release(newValue);
        }

        public void setValue$div_data_release(@NotNull Uri uri) {
            if (Intrinsics.areEqual(this.value, uri)) {
                return;
            }
            this.value = uri;
            notifyVariableChanged(this);
        }
    }

    public /* synthetic */ Variable(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private boolean parseAsBoolean(String str) {
        Boolean boolU1 = StringsKt.u1(str);
        if (boolU1 != null) {
            return boolU1.booleanValue();
        }
        Boolean bool = ConvertUtilsKt.toBoolean(parseAsInt(str));
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new VariableMutationException("Unable to convert " + str + " to boolean", null, 2, null);
    }

    /* JADX INFO: renamed from: parseAsColor-C4zCDoM, reason: not valid java name */
    private int m7612parseAsColorC4zCDoM(String str) {
        Integer numInvoke = ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(str);
        if (numInvoke != null) {
            return Color.m7660constructorimpl(numInvoke.intValue());
        }
        throw new VariableMutationException("Wrong value format for color variable: '" + str + '\'', null, 2, null);
    }

    private double parseAsDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private int parseAsInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private JSONArray parseAsJsonArray(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private JSONObject parseAsJsonObject(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private long parseAsLong(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private Uri parseAsUri(String str) {
        try {
            return Uri.parse(str);
        } catch (IllegalArgumentException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    public void addObserver(@NotNull Function1<? super Variable, Unit> observer) {
        this.observers.addObserver(observer);
    }

    @NotNull
    public abstract String getName();

    @NotNull
    public Object getValue() {
        if (this instanceof StringVariable) {
            return ((StringVariable) this).getValue();
        }
        if (this instanceof IntegerVariable) {
            return Long.valueOf(((IntegerVariable) this).getValue());
        }
        if (this instanceof BooleanVariable) {
            return Boolean.valueOf(((BooleanVariable) this).getValue());
        }
        if (this instanceof DoubleVariable) {
            return Double.valueOf(((DoubleVariable) this).getValue());
        }
        if (this instanceof ColorVariable) {
            return Color.m7659boximpl(((ColorVariable) this).getValue());
        }
        if (this instanceof UrlVariable) {
            return ((UrlVariable) this).getValue();
        }
        if (this instanceof DictVariable) {
            return ((DictVariable) this).getValue();
        }
        if (this instanceof ArrayVariable) {
            return ((ArrayVariable) this).getValue();
        }
        throw new m();
    }

    protected void notifyVariableChanged(@NotNull Variable v10) {
        Assert.assertMainThread();
        Iterator<Function1<Variable, Unit>> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().invoke(v10);
        }
    }

    public void removeObserver(@NotNull Function1<? super Variable, Unit> observer) {
        this.observers.removeObserver(observer);
    }

    @MainThread
    public void set(@NotNull String newValue) throws VariableMutationException {
        if (this instanceof StringVariable) {
            ((StringVariable) this).setValue$div_data_release(newValue);
            return;
        }
        if (this instanceof IntegerVariable) {
            ((IntegerVariable) this).setValue$div_data_release(parseAsLong(newValue));
            return;
        }
        if (this instanceof BooleanVariable) {
            ((BooleanVariable) this).setValue$div_data_release(parseAsBoolean(newValue));
            return;
        }
        if (this instanceof DoubleVariable) {
            ((DoubleVariable) this).setValue$div_data_release(parseAsDouble(newValue));
            return;
        }
        if (this instanceof ColorVariable) {
            ((ColorVariable) this).m7615setValuecIhhviA$div_data_release(m7612parseAsColorC4zCDoM(newValue));
            return;
        }
        if (this instanceof UrlVariable) {
            ((UrlVariable) this).setValue$div_data_release(parseAsUri(newValue));
        } else if (this instanceof DictVariable) {
            ((DictVariable) this).setValue$div_data_release(parseAsJsonObject(newValue));
        } else {
            if (!(this instanceof ArrayVariable)) {
                throw new m();
            }
            ((ArrayVariable) this).setValue$div_data_release(parseAsJsonArray(newValue));
        }
    }

    @MainThread
    public void setValue(@NotNull Variable from) throws VariableMutationException {
        if ((this instanceof StringVariable) && (from instanceof StringVariable)) {
            ((StringVariable) this).setValue$div_data_release(((StringVariable) from).getValue());
            return;
        }
        if ((this instanceof IntegerVariable) && (from instanceof IntegerVariable)) {
            ((IntegerVariable) this).setValue$div_data_release(((IntegerVariable) from).getValue());
            return;
        }
        if ((this instanceof BooleanVariable) && (from instanceof BooleanVariable)) {
            ((BooleanVariable) this).setValue$div_data_release(((BooleanVariable) from).getValue());
            return;
        }
        if ((this instanceof DoubleVariable) && (from instanceof DoubleVariable)) {
            ((DoubleVariable) this).setValue$div_data_release(((DoubleVariable) from).getValue());
            return;
        }
        if ((this instanceof ColorVariable) && (from instanceof ColorVariable)) {
            ((ColorVariable) this).m7615setValuecIhhviA$div_data_release(((ColorVariable) from).getValue());
            return;
        }
        if ((this instanceof UrlVariable) && (from instanceof UrlVariable)) {
            ((UrlVariable) this).setValue$div_data_release(((UrlVariable) from).getValue());
            return;
        }
        if ((this instanceof DictVariable) && (from instanceof DictVariable)) {
            ((DictVariable) this).setValue$div_data_release(((DictVariable) from).getValue());
            return;
        }
        if ((this instanceof ArrayVariable) && (from instanceof ArrayVariable)) {
            ((ArrayVariable) this).setValue$div_data_release(((ArrayVariable) from).getValue());
            return;
        }
        throw new VariableMutationException("Setting value to " + this + " from " + from + " not supported!", null, 2, null);
    }

    @MainThread
    public void setValueDirectly(@NotNull Object newValue) throws VariableMutationException {
        try {
            if (this instanceof StringVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type kotlin.String");
                ((StringVariable) this).setValue$div_data_release((String) newValue);
                return;
            }
            if (this instanceof IntegerVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type kotlin.Number");
                ((IntegerVariable) this).setValue$div_data_release(((Number) newValue).longValue());
                return;
            }
            if (this instanceof BooleanVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type kotlin.Boolean");
                ((BooleanVariable) this).setValue$div_data_release(((Boolean) newValue).booleanValue());
                return;
            }
            if (this instanceof DoubleVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type kotlin.Number");
                ((DoubleVariable) this).setValue$div_data_release(((Number) newValue).doubleValue());
                return;
            }
            if (this instanceof ColorVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
                ((ColorVariable) this).m7615setValuecIhhviA$div_data_release(((Color) newValue).getValue());
                return;
            }
            if (this instanceof UrlVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type android.net.Uri");
                ((UrlVariable) this).setValue$div_data_release((Uri) newValue);
            } else if (this instanceof DictVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type org.json.JSONObject");
                ((DictVariable) this).setValue$div_data_release((JSONObject) newValue);
            } else {
                if (!(this instanceof ArrayVariable)) {
                    throw new m();
                }
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type org.json.JSONArray");
                ((ArrayVariable) this).setValue$div_data_release((JSONArray) newValue);
            }
        } catch (ClassCastException unused) {
            throw new VariableMutationException("Unable to set value with type " + newValue.getClass() + " to " + this, null, 2, null);
        }
    }

    @NotNull
    public JSONObject writeToJSON() {
        JSONSerializable zzVar;
        if (this instanceof ArrayVariable) {
            zzVar = new f(getName(), Expression.Companion.constant$default(Expression.INSTANCE, ((ArrayVariable) this).getValue(), null, 2, null));
        } else if (this instanceof BooleanVariable) {
            zzVar = new p(getName(), Expression.Companion.constant$default(Expression.INSTANCE, Boolean.valueOf(((BooleanVariable) this).getValue()), null, 2, null));
        } else if (this instanceof ColorVariable) {
            zzVar = new z(getName(), Expression.Companion.constant$default(Expression.INSTANCE, Integer.valueOf(((ColorVariable) this).getValue()), null, 2, null));
        } else if (this instanceof DictVariable) {
            zzVar = new t0(getName(), Expression.Companion.constant$default(Expression.INSTANCE, ((DictVariable) this).getValue(), null, 2, null));
        } else if (this instanceof DoubleVariable) {
            zzVar = new sy(getName(), Expression.Companion.constant$default(Expression.INSTANCE, Double.valueOf(((DoubleVariable) this).getValue()), null, 2, null));
        } else if (this instanceof IntegerVariable) {
            zzVar = new hy(getName(), Expression.Companion.constant$default(Expression.INSTANCE, Long.valueOf(((IntegerVariable) this).getValue()), null, 2, null));
        } else if (this instanceof StringVariable) {
            zzVar = new pz(getName(), Expression.Companion.constant$default(Expression.INSTANCE, ((StringVariable) this).getValue(), null, 2, null));
        } else {
            if (!(this instanceof UrlVariable)) {
                throw new m();
            }
            zzVar = new zz(getName(), Expression.Companion.constant$default(Expression.INSTANCE, ((UrlVariable) this).getValue(), null, 2, null));
        }
        return zzVar.writeToJSON();
    }

    private Variable() {
        this.observers = new ObserverList<>();
    }
}
