package androidx.room.util;

import androidx.annotation.RestrictTo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0007\u001a\u001a\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\f\u001a\u00020\r\u001a\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u001a\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f\" \u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0005\u0012\u0004\b\u0003\u0010\u0004¨\u0006\u0012"}, d2 = {"EMPTY_STRING_ARRAY", "", "", "getEMPTY_STRING_ARRAY$annotations", "()V", "[Ljava/lang/String;", "newStringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "appendPlaceholders", "", "builder", "count", "", "splitToIntList", "", "input", "joinIntoString", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class StringUtil {

    @NotNull
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static final void appendPlaceholders(@NotNull StringBuilder builder, int i10) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i11 = 0; i11 < i10; i11++) {
            builder.append("?");
            if (i11 < i10 - 1) {
                builder.append(StringUtils.COMMA);
            }
        }
    }

    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }

    @Nullable
    public static final String joinIntoString(@Nullable List<Integer> list) {
        if (list != null) {
            return CollectionsKt.joinToString$default(list, StringUtils.COMMA, null, null, 0, null, null, 62, null);
        }
        return null;
    }

    @NotNull
    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    @Nullable
    public static final List<Integer> splitToIntList(@Nullable String str) {
        List listX0;
        Integer numValueOf;
        if (str == null || (listX0 = StringsKt.X0(str, new char[]{','}, false, 0, 6, null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listX0.iterator();
        while (it.hasNext()) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) it.next()));
            } catch (NumberFormatException unused) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return arrayList;
    }
}
