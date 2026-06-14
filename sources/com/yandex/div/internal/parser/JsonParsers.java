package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import com.yandex.div.internal.parser.JsonParsers;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public abstract class JsonParsers {

    @NonNull
    private static final ValueValidator<?> ALWAYS_VALID = new ValueValidator() { // from class: z7.b
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return JsonParsers.d(obj);
        }
    };

    @NonNull
    private static final ValueValidator<String> ALWAYS_VALID_STRING = new ValueValidator() { // from class: z7.c
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return JsonParsers.a((String) obj);
        }
    };

    @NonNull
    private static final ListValidator<?> ALWAYS_VALID_LIST = new ListValidator() { // from class: z7.d
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return JsonParsers.c(list);
        }
    };

    @NonNull
    private static final Function1<?, ?> AS_IS = new Function1() { // from class: z7.e
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return JsonParsers.b(obj);
        }
    };

    public static /* synthetic */ boolean a(String str) {
        return true;
    }

    @NonNull
    public static <T> ValueValidator<T> alwaysValid() {
        return (ValueValidator<T>) ALWAYS_VALID;
    }

    public static /* synthetic */ Object b(Object obj) {
        return obj;
    }

    public static /* synthetic */ boolean c(List list) {
        return true;
    }

    public static /* synthetic */ boolean d(Object obj) {
        return true;
    }

    @NonNull
    public static <T> Function1<T, T> doNotConvert() {
        return (Function1<T, T>) AS_IS;
    }
}
