package io.appmetrica.analytics.impl;

import androidx.fragment.app.FragmentTransaction;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public abstract class D9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f75657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumSet f75658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumSet f75659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumSet f75660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumSet f75661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumSet f75662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumSet f75663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumSet f75664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f75665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f75666j;

    static {
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC5168ib enumC5168ib2 = EnumC5168ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        f75657a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC5168ib enumC5168ib3 = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        EnumC5168ib enumC5168ib4 = EnumC5168ib.EVENT_TYPE_PURGE_BUFFER;
        EnumC5168ib enumC5168ib5 = EnumC5168ib.EVENT_TYPE_SEND_REFERRER;
        EnumC5168ib enumC5168ib6 = EnumC5168ib.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC5168ib enumC5168ib7 = EnumC5168ib.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC5168ib enumC5168ib8 = EnumC5168ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC5168ib enumC5168ib9 = EnumC5168ib.EVENT_TYPE_SET_SESSION_EXTRA;
        f75658b = EnumSet.of(enumC5168ib3, enumC5168ib4, enumC5168ib5, enumC5168ib6, enumC5168ib7, EnumC5168ib.EVENT_TYPE_ACTIVATION, enumC5168ib8, enumC5168ib2, enumC5168ib9);
        EnumC5168ib enumC5168ib10 = EnumC5168ib.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC5168ib enumC5168ib11 = EnumC5168ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f75659c = EnumSet.of(enumC5168ib10, enumC5168ib, enumC5168ib2, enumC5168ib8, enumC5168ib11);
        EnumC5168ib enumC5168ib12 = EnumC5168ib.EVENT_TYPE_REGULAR;
        f75660d = EnumSet.of(enumC5168ib, enumC5168ib2, EnumC5168ib.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, EnumC5168ib.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, EnumC5168ib.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, enumC5168ib11, enumC5168ib8, enumC5168ib12, EnumC5168ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC5168ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC5168ib.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC5168ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC5168ib4, EnumC5168ib.EVENT_TYPE_INIT, EnumC5168ib.EVENT_TYPE_SEND_USER_PROFILE, EnumC5168ib.EVENT_TYPE_SET_USER_PROFILE_ID, enumC5168ib5, enumC5168ib6, enumC5168ib7, EnumC5168ib.EVENT_TYPE_FIRST_ACTIVATION, EnumC5168ib.EVENT_TYPE_START, EnumC5168ib.EVENT_TYPE_APP_OPEN, EnumC5168ib.EVENT_TYPE_APP_UPDATE, EnumC5168ib.EVENT_TYPE_ANR);
        f75661e = EnumSet.of(enumC5168ib12);
        f75662f = EnumSet.of(enumC5168ib12);
        f75663g = EnumSet.of(enumC5168ib8);
        f75664h = EnumSet.of(EnumC5168ib.EVENT_TYPE_ALIVE, enumC5168ib4, enumC5168ib9, enumC5168ib2, enumC5168ib8);
        f75665i = Arrays.asList(0, 6145, Integer.valueOf(FragmentTransaction.TRANSIT_FRAGMENT_OPEN), 8224);
        f75666j = Arrays.asList(12290);
    }
}
