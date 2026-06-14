package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class JsonFieldResolver {
    @NonNull
    public static <V> V resolve(@NonNull ParsingContext parsingContext, @NonNull Field<V> field, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) resolve(parsingContext, field, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    private static <T extends EntityTemplate<V>, V> V resolveDependency(@NonNull ParsingContext parsingContext, @NonNull T t10, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TemplateResolver<JSONObject, T, V> templateResolver) {
        try {
            return templateResolver.resolve(parsingContext, t10, jSONObject);
        } catch (ParsingException e10) {
            throw ParsingExceptionKt.dependencyFailed(jSONObject, str, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <V> Expression<V> resolveExpression(@NonNull ParsingContext parsingContext, @NonNull Field<Expression<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonExpressionParser.readExpression(parsingContext, jSONObject, str, typeHelper);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (Expression) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return JsonExpressionParser.readExpression(parsingContext, jSONObject, ((Field.Reference) field).reference, typeHelper);
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @NonNull
    public static <T extends EntityTemplate<V>, V> List<V> resolveList(@NonNull ParsingContext parsingContext, @NonNull Field<List<T>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy, @NonNull Lazy lazy2) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonPropertyParser.readList(parsingContext, jSONObject, str, lazy2);
        }
        int i10 = field.type;
        if (i10 != 2) {
            if (i10 == 3) {
                return JsonPropertyParser.readList(parsingContext, jSONObject, ((Field.Reference) field).reference, lazy2);
            }
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        List list = (List) ((Field.Value) field).value;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        TemplateResolver templateResolver = (TemplateResolver) lazy.getValue();
        for (int i11 = 0; i11 < size; i11++) {
            Object objResolveOptionalDependency = resolveOptionalDependency(parsingContext, (EntityTemplate) list.get(i11), jSONObject, templateResolver);
            if (objResolveOptionalDependency != null) {
                arrayList.add(objResolveOptionalDependency);
            }
        }
        return arrayList;
    }

    @Nullable
    public static <V> V resolveOptional(@NonNull ParsingContext parsingContext, @NonNull Field<V> field, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) resolveOptional(parsingContext, field, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @Nullable
    private static <T extends EntityTemplate<V>, V> V resolveOptionalDependency(@NonNull ParsingContext parsingContext, @NonNull T t10, @NonNull JSONObject jSONObject, @NonNull TemplateResolver<JSONObject, T, V> templateResolver) {
        try {
            return templateResolver.resolve(parsingContext, t10, jSONObject);
        } catch (ParsingException e10) {
            parsingContext.getLogger().logError(e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <V> Expression<V> resolveOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull Field<Expression<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert());
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (Expression) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ((Field.Reference) field).reference, typeHelper, JsonParsers.doNotConvert());
        }
        return null;
    }

    @Nullable
    public static <R, V> ExpressionList<V> resolveOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull Field<ExpressionList<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator) {
        return resolveOptionalExpressionList(parsingContext, field, jSONObject, str, typeHelper, function1, listValidator, JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> List<V> resolveOptionalList(@NonNull ParsingContext parsingContext, @NonNull Field<List<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator) {
        return resolveOptionalList(parsingContext, field, jSONObject, str, function1, listValidator, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> V resolve(@NonNull ParsingContext parsingContext, @NonNull Field<V> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1) {
        return (V) resolve(parsingContext, field, jSONObject, str, function1, JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> V resolveOptional(@NonNull ParsingContext parsingContext, @NonNull Field<V> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1) {
        return (V) resolveOptional(parsingContext, field, jSONObject, str, function1, JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> List<V> resolveOptionalList(@NonNull ParsingContext parsingContext, @NonNull Field<List<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, function1, listValidator, valueValidator);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (List) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return JsonPropertyParser.readOptionalList(parsingContext, jSONObject, ((Field.Reference) field).reference, function1, listValidator, valueValidator);
        }
        return null;
    }

    @NonNull
    public static <V> V resolve(@NonNull ParsingContext parsingContext, @NonNull Field<V> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<V> valueValidator) {
        return (V) resolve(parsingContext, field, jSONObject, str, JsonParsers.doNotConvert(), valueValidator);
    }

    @Nullable
    public static <R, V> V resolveOptional(@NonNull ParsingContext parsingContext, @NonNull Field<V> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        if (field.overridable && jSONObject.has(str)) {
            return (V) JsonPropertyParser.readOptional(parsingContext, jSONObject, str, function1, valueValidator);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (V) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return (V) JsonPropertyParser.readOptional(parsingContext, jSONObject, ((Field.Reference) field).reference, function1, valueValidator);
        }
        return null;
    }

    @Nullable
    public static <R, V> ExpressionList<V> resolveOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull Field<ExpressionList<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, function1, listValidator, valueValidator);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (ExpressionList) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, ((Field.Reference) field).reference, typeHelper, function1, listValidator, valueValidator);
        }
        return null;
    }

    @NonNull
    public static <R, V> V resolve(@NonNull ParsingContext parsingContext, @NonNull Field<V> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        if (field.overridable && jSONObject.has(str)) {
            return (V) JsonPropertyParser.read(parsingContext, jSONObject, str, function1, valueValidator);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (V) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return (V) JsonPropertyParser.read(parsingContext, jSONObject, ((Field.Reference) field).reference, function1, valueValidator);
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, V> Expression<V> resolveExpression(@NonNull ParsingContext parsingContext, @NonNull Field<Expression<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonExpressionParser.readExpression(parsingContext, jSONObject, str, typeHelper, function1);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (Expression) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return JsonExpressionParser.readExpression(parsingContext, jSONObject, ((Field.Reference) field).reference, typeHelper, function1);
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> Expression<V> resolveOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull Field<Expression<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (Expression) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ((Field.Reference) field).reference, typeHelper, function1);
        }
        return null;
    }

    @Nullable
    public static <T extends EntityTemplate<V>, V> List<V> resolveOptionalList(@NonNull ParsingContext parsingContext, @NonNull Field<List<T>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy, @NonNull Lazy lazy2) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, lazy2);
        }
        int i10 = field.type;
        if (i10 != 2) {
            if (i10 == 3) {
                return JsonPropertyParser.readOptionalList(parsingContext, jSONObject, ((Field.Reference) field).reference, lazy2);
            }
            return null;
        }
        List list = (List) ((Field.Value) field).value;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        TemplateResolver templateResolver = (TemplateResolver) lazy.getValue();
        for (int i11 = 0; i11 < size; i11++) {
            Object objResolveOptionalDependency = resolveOptionalDependency(parsingContext, (EntityTemplate) list.get(i11), jSONObject, templateResolver);
            if (objResolveOptionalDependency != null) {
                arrayList.add(objResolveOptionalDependency);
            }
        }
        return arrayList;
    }

    @Nullable
    public static <T extends EntityTemplate<V>, V> V resolveOptional(@NonNull ParsingContext parsingContext, @NonNull Field<T> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy, @NonNull Lazy lazy2) {
        if (field.overridable && jSONObject.has(str)) {
            return (V) JsonPropertyParser.readOptional(parsingContext, jSONObject, str, lazy2);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (V) resolveOptionalDependency(parsingContext, (EntityTemplate) ((Field.Value) field).value, jSONObject, (TemplateResolver) lazy.getValue());
        }
        if (i10 == 3) {
            return (V) JsonPropertyParser.readOptional(parsingContext, jSONObject, ((Field.Reference) field).reference, lazy2);
        }
        return null;
    }

    @NonNull
    public static <T extends EntityTemplate<V>, V> V resolve(@NonNull ParsingContext parsingContext, @NonNull Field<T> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy, @NonNull Lazy lazy2) {
        if (field.overridable && jSONObject.has(str)) {
            return (V) JsonPropertyParser.read(parsingContext, jSONObject, str, lazy2);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (V) resolveDependency(parsingContext, (EntityTemplate) ((Field.Value) field).value, jSONObject, str, (TemplateResolver) lazy.getValue());
        }
        if (i10 == 3) {
            return (V) JsonPropertyParser.read(parsingContext, jSONObject, ((Field.Reference) field).reference, lazy2);
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @NonNull
    public static <T extends EntityTemplate<V>, V> List<V> resolveList(@NonNull ParsingContext parsingContext, @NonNull Field<List<T>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy, @NonNull Lazy lazy2, @NonNull ListValidator<V> listValidator) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonPropertyParser.readList(parsingContext, jSONObject, str, lazy2, listValidator);
        }
        int i10 = field.type;
        if (i10 != 2) {
            if (i10 == 3) {
                return JsonPropertyParser.readList(parsingContext, jSONObject, ((Field.Reference) field).reference, lazy2, listValidator);
            }
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        List list = (List) ((Field.Value) field).value;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        TemplateResolver templateResolver = (TemplateResolver) lazy.getValue();
        for (int i11 = 0; i11 < size; i11++) {
            Object objResolveOptionalDependency = resolveOptionalDependency(parsingContext, (EntityTemplate) list.get(i11), jSONObject, templateResolver);
            if (objResolveOptionalDependency != null) {
                arrayList.add(objResolveOptionalDependency);
            }
        }
        if (listValidator.isValid(arrayList)) {
            return arrayList;
        }
        throw ParsingExceptionKt.invalidValue(jSONObject, str, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> Expression<V> resolveOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull Field<Expression<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @Nullable Expression<V> expression) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, expression);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (Expression) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ((Field.Reference) field).reference, typeHelper, function1, expression);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <V> Expression<V> resolveExpression(@NonNull ParsingContext parsingContext, @NonNull Field<Expression<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ValueValidator<V> valueValidator) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonExpressionParser.readExpression(parsingContext, jSONObject, str, typeHelper, valueValidator);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (Expression) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return JsonExpressionParser.readExpression(parsingContext, jSONObject, ((Field.Reference) field).reference, typeHelper, valueValidator);
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <V> Expression<V> resolveOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull Field<Expression<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ValueValidator<V> valueValidator, @Nullable Expression<V> expression) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, str, typeHelper, valueValidator, expression);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (Expression) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ((Field.Reference) field).reference, typeHelper, valueValidator, expression);
        }
        return null;
    }

    @Nullable
    public static <T extends EntityTemplate<V>, V> List<V> resolveOptionalList(@NonNull ParsingContext parsingContext, @NonNull Field<List<T>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy, @NonNull Lazy lazy2, @NonNull ListValidator<V> listValidator) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, lazy2, listValidator);
        }
        int i10 = field.type;
        if (i10 != 2) {
            if (i10 == 3) {
                return JsonPropertyParser.readOptionalList(parsingContext, jSONObject, ((Field.Reference) field).reference, lazy2, listValidator);
            }
            return null;
        }
        List list = (List) ((Field.Value) field).value;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        TemplateResolver templateResolver = (TemplateResolver) lazy.getValue();
        for (int i11 = 0; i11 < size; i11++) {
            Object objResolveOptionalDependency = resolveOptionalDependency(parsingContext, (EntityTemplate) list.get(i11), jSONObject, templateResolver);
            if (objResolveOptionalDependency != null) {
                arrayList.add(objResolveOptionalDependency);
            }
        }
        if (listValidator.isValid(arrayList)) {
            return arrayList;
        }
        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, V> Expression<V> resolveExpression(@NonNull ParsingContext parsingContext, @NonNull Field<Expression<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonExpressionParser.readExpression(parsingContext, jSONObject, str, typeHelper, function1, valueValidator);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (Expression) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return JsonExpressionParser.readExpression(parsingContext, jSONObject, ((Field.Reference) field).reference, typeHelper, function1, valueValidator);
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> Expression<V> resolveOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull Field<Expression<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, valueValidator, null);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (Expression) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ((Field.Reference) field).reference, typeHelper, function1, valueValidator, null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> Expression<V> resolveOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull Field<Expression<V>> field, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator, @Nullable Expression<V> expression) {
        if (field.overridable && jSONObject.has(str)) {
            return JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, valueValidator, expression);
        }
        int i10 = field.type;
        if (i10 == 2) {
            return (Expression) ((Field.Value) field).value;
        }
        if (i10 == 3) {
            return JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ((Field.Reference) field).reference, typeHelper, function1, valueValidator, expression);
        }
        return null;
    }
}
