package com.yandex.div.evaluable;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001a1\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0002\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0002\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a%\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0012\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0007\u0010\u0017\u001a\u0019\u0010\u0018\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u0018\u001a\u00020\u0000*\u00020\u000bH\u0000¢\u0006\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"", "expression", "reason", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", "throwExceptionOnEvaluationFailed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Void;", "name", "", "", "args", "throwExceptionOnFunctionEvaluationFailed", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Void;", "throwExceptionOnMethodEvaluationFailed", "functionToMessageFormat", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "methodToMessageFormat", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "operator", "left", "right", "(Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Void;", "toMessageFormat", "(Ljava/util/List;)Ljava/lang/String;", "(Ljava/lang/Object;)Ljava/lang/String;", "div-evaluable"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class EvaluableExceptionKt {
    @NotNull
    public static final String functionToMessageFormat(@NotNull String name, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        return CollectionsKt.joinToString$default(args, null, name + '(', ")", 0, null, new Function1<Object, CharSequence>() { // from class: com.yandex.div.evaluable.EvaluableExceptionKt.functionToMessageFormat.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return EvaluableExceptionKt.toMessageFormat(it);
            }
        }, 25, null);
    }

    @NotNull
    public static final String methodToMessageFormat(@NotNull String name, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.size() <= 1) {
            return name + "()";
        }
        return CollectionsKt.joinToString$default(args.subList(1, args.size()), StringUtils.COMMA, name + '(', ")", 0, null, null, 56, null);
    }

    @NotNull
    public static final Void throwExceptionOnEvaluationFailed(@NotNull String expression, @NotNull String reason, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(reason, "reason");
        throw new EvaluableException("Failed to evaluate [" + expression + "]. " + reason, exc);
    }

    public static /* synthetic */ Void throwExceptionOnEvaluationFailed$default(String str, String str2, Exception exc, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            exc = null;
        }
        return throwExceptionOnEvaluationFailed(str, str2, exc);
    }

    @NotNull
    public static final Void throwExceptionOnFunctionEvaluationFailed(@NotNull String name, @NotNull List<? extends Object> args, @NotNull String reason, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(reason, "reason");
        throwExceptionOnEvaluationFailed(functionToMessageFormat(name, args), reason, exc);
        throw new g();
    }

    public static /* synthetic */ Void throwExceptionOnFunctionEvaluationFailed$default(String str, List list, String str2, Exception exc, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            exc = null;
        }
        return throwExceptionOnFunctionEvaluationFailed(str, list, str2, exc);
    }

    @NotNull
    public static final Void throwExceptionOnMethodEvaluationFailed(@NotNull String name, @NotNull List<? extends Object> args, @NotNull String reason, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(reason, "reason");
        throwExceptionOnEvaluationFailed(methodToMessageFormat(name, args), reason, exc);
        throw new g();
    }

    @NotNull
    public static final String toMessageFormat(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1<Object, CharSequence>() { // from class: com.yandex.div.evaluable.EvaluableExceptionKt.toMessageFormat.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return EvaluableExceptionKt.toMessageFormat(it);
            }
        }, 30, null);
    }

    @NotNull
    public static final Void throwExceptionOnEvaluationFailed(@NotNull Token.Operator.Binary operator, @NotNull Object left, @NotNull Object right) {
        EvaluableType evaluableType;
        String string;
        EvaluableType evaluableType2;
        EvaluableType evaluableType3;
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        String str = toMessageFormat(left) + ' ' + operator + ' ' + toMessageFormat(right);
        if (Intrinsics.areEqual(left.getClass(), right.getClass())) {
            StringBuilder sb2 = new StringBuilder();
            EvaluableType.Companion companion = EvaluableType.INSTANCE;
            if (left instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (left instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (left instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (left instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (left instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (left instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (left instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (left instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(left instanceof JSONArray)) {
                    throw new EvaluableException("Unable to find type for " + left.getClass().getName(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            sb2.append(evaluableType.getTypeName());
            sb2.append(" type");
            string = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("different types: ");
            EvaluableType.Companion companion2 = EvaluableType.INSTANCE;
            if (left instanceof Long) {
                evaluableType2 = EvaluableType.INTEGER;
            } else if (left instanceof Double) {
                evaluableType2 = EvaluableType.NUMBER;
            } else if (left instanceof Boolean) {
                evaluableType2 = EvaluableType.BOOLEAN;
            } else if (left instanceof String) {
                evaluableType2 = EvaluableType.STRING;
            } else if (left instanceof DateTime) {
                evaluableType2 = EvaluableType.DATETIME;
            } else if (left instanceof Color) {
                evaluableType2 = EvaluableType.COLOR;
            } else if (left instanceof Url) {
                evaluableType2 = EvaluableType.URL;
            } else if (left instanceof JSONObject) {
                evaluableType2 = EvaluableType.DICT;
            } else {
                if (!(left instanceof JSONArray)) {
                    throw new EvaluableException("Unable to find type for " + left.getClass().getName(), null, 2, null);
                }
                evaluableType2 = EvaluableType.ARRAY;
            }
            sb3.append(evaluableType2.getTypeName());
            sb3.append(" and ");
            if (right instanceof Long) {
                evaluableType3 = EvaluableType.INTEGER;
            } else if (right instanceof Double) {
                evaluableType3 = EvaluableType.NUMBER;
            } else if (right instanceof Boolean) {
                evaluableType3 = EvaluableType.BOOLEAN;
            } else if (right instanceof String) {
                evaluableType3 = EvaluableType.STRING;
            } else if (right instanceof DateTime) {
                evaluableType3 = EvaluableType.DATETIME;
            } else if (right instanceof Color) {
                evaluableType3 = EvaluableType.COLOR;
            } else if (right instanceof Url) {
                evaluableType3 = EvaluableType.URL;
            } else if (right instanceof JSONObject) {
                evaluableType3 = EvaluableType.DICT;
            } else {
                if (!(right instanceof JSONArray)) {
                    throw new EvaluableException("Unable to find type for " + right.getClass().getName(), null, 2, null);
                }
                evaluableType3 = EvaluableType.ARRAY;
            }
            sb3.append(evaluableType3.getTypeName());
            string = sb3.toString();
        }
        throwExceptionOnEvaluationFailed$default(str, "Operator '" + operator + "' cannot be applied to " + string + '.', null, 4, null);
        throw new g();
    }

    @NotNull
    public static final String toMessageFormat(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (obj instanceof JSONArray) {
            return "<array>";
        }
        if (obj instanceof JSONObject) {
            return "<dict>";
        }
        if (!(obj instanceof String)) {
            return obj.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\'');
        sb2.append(obj);
        sb2.append('\'');
        return sb2.toString();
    }
}
