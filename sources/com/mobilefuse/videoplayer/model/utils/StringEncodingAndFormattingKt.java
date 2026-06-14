package com.mobilefuse.videoplayer.model.utils;

import android.text.TextUtils;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.videoplayer.model.EnumWithValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarTimeZone;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0002\u0010\n\u001a\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u000e\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\b¨\u0006\u000e"}, d2 = {"encodeUriComponent", "", "value", "collection", "", "enumCollectionToString", "Lcom/mobilefuse/videoplayer/model/EnumWithValue;", "formattedTimeToMillis", "", "formattedTime", "(Ljava/lang/String;)Ljava/lang/Long;", "getIso8601Timestamp", "millisToFormattedTime", "millis", "mobilefuse-video-player_release"}, k = 2, mv = {1, 4, 3})
public final class StringEncodingAndFormattingKt {
    @NotNull
    public static final String encodeUriComponent(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            String strEncode = URLEncoder.encode(value, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(strEncode, "URLEncoder.encode(value, \"UTF-8\")");
            return new Regex("%7E").replace(new Regex("%29").replace(new Regex("%28").replace(new Regex("%27").replace(new Regex("%21").replace(new Regex("\\+").replace(strEncode, "%20"), "!"), "'"), "("), ")"), "~");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return value;
        }
    }

    @NotNull
    public static final String enumCollectionToString(@NotNull Collection<? extends EnumWithValue<?>> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumWithValue) it.next()).getStringValue());
        }
        String strJoin = TextUtils.join(StringUtils.COMMA, arrayList);
        Intrinsics.checkNotNullExpressionValue(strJoin, "TextUtils.join(\",\", values)");
        return strJoin;
    }

    @Nullable
    public static final Long formattedTimeToMillis(@NotNull String formattedTime) {
        Either errorResult;
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(formattedTime, "formattedTime");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        Object value = null;
        try {
            List listSplit$default = StringsKt.split$default(formattedTime, new String[]{"."}, false, 0, 6, null);
            if (listSplit$default.isEmpty()) {
                return null;
            }
            String str = (String) CollectionsKt.getOrNull(listSplit$default, 1);
            int iIntValue = (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue();
            List listSplit$default2 = StringsKt.split$default((CharSequence) listSplit$default.get(0), new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, false, 0, 6, null);
            if (listSplit$default2.isEmpty()) {
                return null;
            }
            Pair pair = new Pair(1, 0L);
            if (!listSplit$default2.isEmpty()) {
                ListIterator listIterator = listSplit$default2.listIterator(listSplit$default2.size());
                while (listIterator.hasPrevious()) {
                    int i10 = Integer.parseInt((String) listIterator.previous());
                    if (i10 < 0 || i10 > 59) {
                        return null;
                    }
                    pair = new Pair(Integer.valueOf(((Number) pair.getFirst()).intValue() * 60), Long.valueOf(((Number) pair.getSecond()).longValue() + ((long) (i10 * ((Number) pair.getFirst()).intValue()))));
                }
            }
            errorResult = new SuccessResult(Long.valueOf((((Number) pair.getSecond()).longValue() * ((long) 1000)) + ((long) iIntValue)));
        } catch (Throwable th2) {
            if (StringEncodingAndFormattingKt$formattedTimeToMillis$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (Long) value;
    }

    @NotNull
    public static final String getIso8601Timestamp() {
        String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(Date())");
        return str;
    }

    @NotNull
    public static final String millisToFormattedTime(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(Long.valueOf(j10));
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(millis)");
        return str;
    }

    @NotNull
    public static final String encodeUriComponent(@NotNull Collection<String> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(encodeUriComponent((String) it.next()));
        }
        String strJoin = TextUtils.join(StringUtils.COMMA, arrayList);
        Intrinsics.checkNotNullExpressionValue(strJoin, "TextUtils.join(\",\", encodedItems)");
        return strJoin;
    }
}
