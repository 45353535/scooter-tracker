package com.yandex.div.internal.parser;

import android.net.Uri;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.internal.util.ConvertUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\"0\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"8\u0010\u0007\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"0\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005\"0\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0000j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005\"0\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0000j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005\"4\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0000j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\f`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005\"0\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0000j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005\"0\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0000j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005*.\u0010\u0015\u001a\u0004\b\u0000\u0010\u0013\u001a\u0004\b\u0001\u0010\u0014\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¨\u0006\u0016"}, d2 = {"Lkotlin/Function1;", "", "", "Lcom/yandex/div/internal/parser/Converter;", "COLOR_INT_TO_STRING", "Lkotlin/jvm/functions/Function1;", "", "STRING_TO_COLOR_INT", "Landroid/net/Uri;", "URI_TO_STRING", "STRING_TO_URI", "ANY_TO_URI", "", "ANY_TO_BOOLEAN", "", "", "NUMBER_TO_DOUBLE", "", "NUMBER_TO_INT", "T", "R", "Converter", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ParsingConvertersKt {

    @NotNull
    public static final Function1<Integer, String> COLOR_INT_TO_STRING = new Function1<Integer, String>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$COLOR_INT_TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return invoke(num.intValue());
        }

        @NotNull
        public final String invoke(int i10) {
            return Color.m7666toStringimpl(Color.m7660constructorimpl(i10));
        }
    };

    @NotNull
    public static final Function1<Object, Integer> STRING_TO_COLOR_INT = new Function1<Object, Integer>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$STRING_TO_COLOR_INT$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Integer invoke(@Nullable Object obj) {
            if (obj instanceof String) {
                return Integer.valueOf(Color.Companion.m7669parseC4zCDoM((String) obj));
            }
            if (obj instanceof Color) {
                return Integer.valueOf(((Color) obj).m7667unboximpl());
            }
            if (obj == null) {
                return null;
            }
            throw new ClassCastException("Received value of wrong type");
        }
    };

    @NotNull
    public static final Function1<Uri, String> URI_TO_STRING = new Function1<Uri, String>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$URI_TO_STRING$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull Uri uri) {
            return uri.toString();
        }
    };

    @NotNull
    public static final Function1<String, Uri> STRING_TO_URI = new Function1<String, Uri>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$STRING_TO_URI$1
        @Override // kotlin.jvm.functions.Function1
        public final Uri invoke(@NotNull String str) {
            return Uri.parse(str);
        }
    };

    @NotNull
    public static final Function1<Object, Uri> ANY_TO_URI = new Function1<Object, Uri>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$ANY_TO_URI$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Uri invoke(@NotNull Object obj) {
            if (obj instanceof String) {
                return Uri.parse((String) obj);
            }
            if (obj instanceof Url) {
                return Uri.parse(((Url) obj).m7676unboximpl());
            }
            throw new ClassCastException("Received value of wrong type");
        }
    };

    @NotNull
    public static final Function1<Object, Boolean> ANY_TO_BOOLEAN = new Function1<Object, Boolean>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$ANY_TO_BOOLEAN$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Boolean invoke(@NotNull Object obj) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof Number) {
                return ConvertUtilsKt.toBoolean((Number) obj);
            }
            throw new ClassCastException("Received value of wrong type");
        }
    };

    @NotNull
    public static final Function1<Number, Double> NUMBER_TO_DOUBLE = new Function1<Number, Double>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$NUMBER_TO_DOUBLE$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Double invoke(@NotNull Number number) {
            return Double.valueOf(number.doubleValue());
        }
    };

    @NotNull
    public static final Function1<Number, Long> NUMBER_TO_INT = new Function1<Number, Long>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$NUMBER_TO_INT$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Long invoke(@NotNull Number number) {
            return Long.valueOf(number.longValue());
        }
    };
}
