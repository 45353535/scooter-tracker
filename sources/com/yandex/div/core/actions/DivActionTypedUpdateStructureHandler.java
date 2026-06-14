package com.yandex.div.core.actions;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.List;
import k8.m5;
import k8.r5;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010 \u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!J1\u0010\u000b\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010%¨\u0006'"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "<init>", "()V", "Lk8/r5;", "action", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "handleAction", "(Lk8/r5;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lcom/yandex/div/data/Variable$ArrayVariable;", "variable", "", "", "pathSegments", "", "newValue", "", "updateArrayStructure", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/data/Variable$ArrayVariable;Ljava/util/List;Ljava/lang/Object;)V", "Lcom/yandex/div/data/Variable$DictVariable;", "updateDictStructure", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/data/Variable$DictVariable;Ljava/util/List;Ljava/lang/Object;)V", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", "root", "findStructureElement", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;Ljava/util/List;)Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", TypedValues.AttributesType.S_TARGET, "pathSegment", "setValue", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;Ljava/lang/String;Ljava/lang/Object;)Z", "scopeId", "Lk8/m5;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "(Ljava/lang/String;Lk8/m5;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Structure", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivActionTypedUpdateStructureHandler implements DivActionTypedHandler {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\n\u000b\fJ\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H&¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", "", "", C4240b4.i.W, "get", "(Ljava/lang/String;)Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", "value", "", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "Array", "Dictionary", "NonStructure", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure$Array;", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure$Dictionary;", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure$NonStructure;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private interface Structure {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure$Array;", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", "array", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)V", "size", "", "getSize", "()I", "get", C4240b4.i.W, "", "set", "", "value", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Array implements Structure {

            @NotNull
            private final JSONArray array;

            public Array(@NotNull JSONArray jSONArray) {
                this.array = jSONArray;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            @Nullable
            public Structure get(@NotNull String key) {
                Object objOpt = this.array.opt(Integer.parseInt(key));
                if (objOpt instanceof JSONArray) {
                    return new Array((JSONArray) objOpt);
                }
                if (objOpt instanceof JSONObject) {
                    return new Dictionary((JSONObject) objOpt);
                }
                if (objOpt == null ? true : Intrinsics.areEqual(objOpt, JSONObject.NULL)) {
                    return null;
                }
                return NonStructure.INSTANCE;
            }

            public int getSize() {
                return this.array.length();
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(@NotNull String key, @NotNull Object value) {
                int i10 = Integer.parseInt(key);
                if (i10 < 0 || i10 > getSize()) {
                    throw new IndexOutOfBoundsException();
                }
                try {
                    Result.Companion companion = Result.f93230c;
                    Result.b(this.array.put(i10, value));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    Result.b(d.a(th2));
                }
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure$Dictionary;", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", "Lorg/json/JSONObject;", "dictionary", "<init>", "(Lorg/json/JSONObject;)V", "", C4240b4.i.W, "get", "(Ljava/lang/String;)Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", "", "value", "", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lorg/json/JSONObject;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dictionary implements Structure {

            @NotNull
            private final JSONObject dictionary;

            public Dictionary(@NotNull JSONObject jSONObject) {
                this.dictionary = jSONObject;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            @Nullable
            public Structure get(@NotNull String key) {
                Object objOpt = this.dictionary.opt(key);
                if (objOpt instanceof JSONArray) {
                    return new Array((JSONArray) objOpt);
                }
                if (objOpt instanceof JSONObject) {
                    return new Dictionary((JSONObject) objOpt);
                }
                if (objOpt == null ? true : Intrinsics.areEqual(objOpt, JSONObject.NULL)) {
                    return null;
                }
                return NonStructure.INSTANCE;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(@NotNull String key, @NotNull Object value) {
                try {
                    Result.Companion companion = Result.f93230c;
                    Result.b(this.dictionary.put(key, value));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    Result.b(d.a(th2));
                }
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure$NonStructure;", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", "<init>", "()V", "", C4240b4.i.W, "get", "(Ljava/lang/String;)Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", "", "value", "", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NonStructure implements Structure {

            @NotNull
            public static final NonStructure INSTANCE = new NonStructure();

            private NonStructure() {
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            @Nullable
            public Structure get(@NotNull String key) {
                throw new UnsupportedOperationException();
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(@NotNull String key, @NotNull Object value) {
                throw new UnsupportedOperationException();
            }
        }

        @Nullable
        Structure get(@NotNull String key);

        void set(@NotNull String key, @NotNull Object value);
    }

    private final Structure findStructureElement(Div2View divView, Structure root, List<String> pathSegments) {
        int i10 = 0;
        Structure structure = root;
        for (Object obj : pathSegments) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            try {
                structure = structure.get(str);
                if (Intrinsics.areEqual(structure, Structure.NonStructure.INSTANCE)) {
                    DivActionTypedUtilsKt.logError(divView, new RuntimeException("Element with path '" + CollectionsKt.joinToString$default(CollectionsKt.take(pathSegments, i11), "/", null, null, 0, null, null, 62, null) + "' is not a structure"));
                    return null;
                }
                if (structure == null) {
                    DivActionTypedUtilsKt.logError(divView, new RuntimeException("Element with path '" + CollectionsKt.joinToString$default(CollectionsKt.take(pathSegments, i11), "/", null, null, 0, null, null, 62, null) + "' is not found"));
                    return null;
                }
                i10 = i11;
            } catch (NumberFormatException e10) {
                DivActionTypedUtilsKt.logError(divView, new RuntimeException("Unable to use '" + str + "' as array index", e10));
                return null;
            }
        }
        return structure;
    }

    private final boolean setValue(Div2View divView, Structure target, String pathSegment, Object newValue) {
        try {
            target.set(pathSegment, newValue);
            return true;
        } catch (IndexOutOfBoundsException e10) {
            DivActionTypedUtilsKt.logError(divView, new RuntimeException("Position '" + pathSegment + "' is out of array bounds", e10));
            return false;
        } catch (NumberFormatException e11) {
            DivActionTypedUtilsKt.logError(divView, new RuntimeException("Unable to use '" + pathSegment + "' as array index", e11));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateArrayStructure(Div2View divView, Variable.ArrayVariable variable, List<String> pathSegments, Object newValue) {
        Object value = variable.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type org.json.JSONArray");
        JSONArray jSONArray = (JSONArray) value;
        Structure structureFindStructureElement = findStructureElement(divView, new Structure.Array(jSONArray), CollectionsKt.dropLast(pathSegments, 1));
        if (structureFindStructureElement == null || !setValue(divView, structureFindStructureElement, (String) CollectionsKt.last((List) pathSegments), newValue)) {
            return;
        }
        variable.set(jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDictStructure(Div2View divView, Variable.DictVariable variable, List<String> pathSegments, Object newValue) {
        Object value = variable.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject = (JSONObject) value;
        Structure structureFindStructureElement = findStructureElement(divView, new Structure.Dictionary(jSONObject), CollectionsKt.dropLast(pathSegments, 1));
        if (structureFindStructureElement == null || !setValue(divView, structureFindStructureElement, (String) CollectionsKt.last((List) pathSegments), newValue)) {
            return;
        }
        variable.set(jSONObject);
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull m5 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (action instanceof m5.v) {
            return handleAction(((m5.v) action).c(), view, resolver);
        }
        return false;
    }

    private final boolean handleAction(r5 action, final Div2View divView, ExpressionResolver resolver) {
        String str = (String) action.f90633c.evaluate(resolver);
        String str2 = (String) action.f90631a.evaluate(resolver);
        List listSplit$default = StringsKt.split$default(str2, new String[]{"/"}, false, 0, 6, null);
        final ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        final Object objEvaluate = DivActionTypedUtilsKt.evaluate(action.f90632b, resolver);
        if (str2.length() <= 0 || !arrayList.isEmpty()) {
            VariableMutationHandler.INSTANCE.setVariable(divView, str, resolver, new Function1<Variable, Variable>() { // from class: com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.handleAction.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Variable invoke(@NotNull Variable variable) {
                    if (variable instanceof Variable.ArrayVariable) {
                        DivActionTypedUpdateStructureHandler.this.updateArrayStructure(divView, (Variable.ArrayVariable) variable, arrayList, objEvaluate);
                        return variable;
                    }
                    if (variable instanceof Variable.DictVariable) {
                        DivActionTypedUpdateStructureHandler.this.updateDictStructure(divView, (Variable.DictVariable) variable, arrayList, objEvaluate);
                        return variable;
                    }
                    DivActionTypedUtilsKt.logError(divView, new RuntimeException("Action requires array or dictionary variable"));
                    return variable;
                }
            });
            return true;
        }
        DivActionTypedUtilsKt.logError(divView, new RuntimeException("Malformed path '" + str2 + "': all path segments are empty"));
        return true;
    }
}
