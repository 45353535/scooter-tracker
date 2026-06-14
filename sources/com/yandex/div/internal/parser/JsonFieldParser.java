package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.ParsingContext;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class JsonFieldParser {
    private static final ValueValidator<String> IS_NOT_EMPTY = new ValueValidator() { // from class: z7.a
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return JsonFieldParser.a((String) obj);
        }
    };

    public static /* synthetic */ boolean a(String str) {
        return !str.isEmpty();
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field) {
        return readField(parsingContext, jSONObject, str, z10, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z10, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<List<V>> readListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<List<V>> field, @NonNull Lazy lazy) {
        try {
            return new Field.Value(z10, JsonPropertyParser.readList(parsingContext, jSONObject, str, lazy));
        } catch (ParsingException e10) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e10);
            Field<List<V>> fieldReferenceOrFallback = referenceOrFallback(z10, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e10;
        }
    }

    @NonNull
    public static <R, V> Field<ExpressionList<V>> readOptionalExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<ExpressionList<V>> field, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator) {
        return readOptionalExpressionListField(parsingContext, jSONObject, str, typeHelper, z10, field, function1, listValidator, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field) {
        return readOptionalField(parsingContext, jSONObject, str, z10, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z10, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<List<V>> field, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator) {
        return readOptionalListField(parsingContext, jSONObject, str, z10, field, function1, listValidator, JsonParsers.alwaysValid());
    }

    @Nullable
    public static String readReference(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, '$' + str, IS_NOT_EMPTY);
    }

    @Nullable
    public static <V> Field<V> referenceOrFallback(boolean z10, @Nullable String str, @Nullable Field<V> field) {
        if (str != null) {
            return new Field.Reference(z10, str);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        if (z10) {
            return Field.INSTANCE.nullField(z10);
        }
        return null;
    }

    public static <V> void writeExpressionField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<Expression<V>> field) {
        writeExpressionField(parsingContext, jSONObject, str, field, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<ExpressionList<V>> field, @NonNull Function1<V, R> function1) {
        if (field instanceof Field.Value) {
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, str, (ExpressionList) ((Field.Value) field).value, function1);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    public static <V> void writeField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<V> field) {
        writeField(parsingContext, jSONObject, str, field, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<List<V>> field, @NonNull Function1<V, R> function1) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.writeList(parsingContext, jSONObject, str, (List) ((Field.Value) field).value, function1);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    @NonNull
    public static <R, V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull Function1<R, V> function1) {
        return readField(parsingContext, jSONObject, str, z10, field, function1, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull Function1<R, V> function1) {
        return readOptionalField(parsingContext, jSONObject, str, z10, field, function1, JsonParsers.alwaysValid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> void writeExpressionField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<Expression<V>> field, @NonNull Function1<V, R> function1) {
        if (field instanceof Field.Value) {
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, str, (Expression) ((Field.Value) field).value, function1);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    public static <R, V> void writeField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<V> field, @NonNull Function1<V, R> function1) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.write(parsingContext, jSONObject, str, ((Field.Value) field).value, (Function1<T, R>) function1);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull ValueValidator<V> valueValidator) {
        return readField(parsingContext, jSONObject, str, z10, field, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field, @NonNull Function1<R, V> function1) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z10, field, function1, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<ExpressionList<V>> readOptionalExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<ExpressionList<V>> field, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        ExpressionList optionalExpressionList = JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, function1, listValidator, valueValidator);
        if (optionalExpressionList != null) {
            return new Field.Value(z10, optionalExpressionList);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.INSTANCE.nullField(z10);
    }

    @NonNull
    public static <R, V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Object optional = JsonPropertyParser.readOptional(parsingContext, jSONObject, str, function1, valueValidator);
        if (optional != null) {
            return new Field.Value(z10, optional);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.INSTANCE.nullField(z10);
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field, @NonNull Function1<R, V> function1) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z10, field, function1, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<List<V>> field, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, function1, listValidator, valueValidator);
        if (optionalList != null) {
            return new Field.Value(z10, optionalList);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.INSTANCE.nullField(z10);
    }

    @NonNull
    public static <R, V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        try {
            return new Field.Value(z10, JsonPropertyParser.read(parsingContext, jSONObject, str, function1, valueValidator));
        } catch (ParsingException e10) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e10);
            Field<V> fieldReferenceOrFallback = referenceOrFallback(z10, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e10;
        }
    }

    @NonNull
    public static <V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field, @NonNull ValueValidator<V> valueValidator) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z10, field, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field, @NonNull ValueValidator<V> valueValidator) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z10, field, JsonParsers.doNotConvert(), valueValidator);
    }

    public static <V> void writeListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<List<V>> field, @NonNull Lazy lazy) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.writeList(parsingContext, jSONObject, str, (List) ((Field.Value) field).value, lazy);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    public static <V> void writeField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<V> field, @NonNull Lazy lazy) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.write(parsingContext, jSONObject, str, ((Field.Value) field).value, lazy);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        try {
            return new Field.Value(z10, JsonExpressionParser.readExpression(parsingContext, jSONObject, str, typeHelper, function1, valueValidator));
        } catch (ParsingException e10) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e10);
            Field<Expression<V>> fieldReferenceOrFallback = referenceOrFallback(z10, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e10;
        }
    }

    @NonNull
    public static <V> Field<List<V>> readListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<List<V>> field, @NonNull Lazy lazy, @NonNull ListValidator<V> listValidator) {
        try {
            return new Field.Value(z10, JsonPropertyParser.readList(parsingContext, jSONObject, str, lazy, listValidator));
        } catch (ParsingException e10) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e10);
            Field<List<V>> fieldReferenceOrFallback = referenceOrFallback(z10, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e10;
        }
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, valueValidator, null);
        if (optionalExpression != null) {
            return new Field.Value(z10, optionalExpression);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.INSTANCE.nullField(z10);
    }

    @NonNull
    public static <V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull Lazy lazy) {
        Object optional = JsonPropertyParser.readOptional(parsingContext, jSONObject, str, lazy);
        if (optional != null) {
            return new Field.Value(z10, optional);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.INSTANCE.nullField(z10);
    }

    @NonNull
    public static <V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<List<V>> field, @NonNull Lazy lazy) {
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, lazy);
        if (optionalList != null) {
            return new Field.Value(z10, optionalList);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.INSTANCE.nullField(z10);
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull Lazy lazy) {
        try {
            return new Field.Value(z10, JsonPropertyParser.read(parsingContext, jSONObject, str, lazy));
        } catch (ParsingException e10) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e10);
            Field<V> fieldReferenceOrFallback = referenceOrFallback(z10, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e10;
        }
    }

    @NonNull
    public static <V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<List<V>> field, @NonNull Lazy lazy, @NonNull ListValidator<V> listValidator) {
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, lazy, listValidator);
        if (optionalList != null) {
            return new Field.Value(z10, optionalList);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.INSTANCE.nullField(z10);
    }
}
