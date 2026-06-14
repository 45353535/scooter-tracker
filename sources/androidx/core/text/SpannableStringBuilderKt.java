package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.ColorInt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a$\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a<\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a0\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\n\u0010\r\u001a(\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a(\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a(\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0011\u0010\u000f\u001a2\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a2\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0014\u001a(\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0016\u0010\u000f\u001a0\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a(\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u001b\u0010\u000f\u001a(\u0010\u001c\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "", "builderAction", "Landroid/text/SpannedString;", "buildSpannedString", "(Lkotlin/jvm/functions/Function1;)Landroid/text/SpannedString;", "", "", "spans", "inSpans", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", "span", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", "bold", "(Landroid/text/SpannableStringBuilder;Lkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", "italic", "underline", "", "color", "(Landroid/text/SpannableStringBuilder;ILkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", "backgroundColor", "strikeThrough", "", "proportion", "scale", "(Landroid/text/SpannableStringBuilder;FLkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", "superscript", "subscript", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SpannableStringBuilderKt {
    @NotNull
    public static final SpannableStringBuilder backgroundColor(@NotNull SpannableStringBuilder spannableStringBuilder, @ColorInt int i10, @NotNull Function1<? super SpannableStringBuilder, Unit> function1) {
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i10);
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder bold(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Function1<? super SpannableStringBuilder, Unit> function1) {
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannedString buildSpannedString(@NotNull Function1<? super SpannableStringBuilder, Unit> function1) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        function1.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    @NotNull
    public static final SpannableStringBuilder color(@NotNull SpannableStringBuilder spannableStringBuilder, @ColorInt int i10, @NotNull Function1<? super SpannableStringBuilder, Unit> function1) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i10);
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder inSpans(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Object[] objArr, @NotNull Function1<? super SpannableStringBuilder, Unit> function1) {
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder italic(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Function1<? super SpannableStringBuilder, Unit> function1) {
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder scale(@NotNull SpannableStringBuilder spannableStringBuilder, float f10, @NotNull Function1<? super SpannableStringBuilder, Unit> function1) {
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f10);
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder strikeThrough(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Function1<? super SpannableStringBuilder, Unit> function1) {
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder subscript(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Function1<? super SpannableStringBuilder, Unit> function1) {
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder superscript(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Function1<? super SpannableStringBuilder, Unit> function1) {
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder underline(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Function1<? super SpannableStringBuilder, Unit> function1) {
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder inSpans(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull Object obj, @NotNull Function1<? super SpannableStringBuilder, Unit> function1) {
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
