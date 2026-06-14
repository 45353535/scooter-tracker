package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5016ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5016ce f76966a = new C5016ce();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f76967b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f76968c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.13.0", "50142752");

    public final synchronized ExponentialBackoffDataHolder a(EnumC4964ae enumC4964ae) {
        Object exponentialBackoffDataHolder;
        try {
            LinkedHashMap linkedHashMap = f76967b;
            exponentialBackoffDataHolder = linkedHashMap.get(enumC4964ae);
            if (exponentialBackoffDataHolder == null) {
                exponentialBackoffDataHolder = new ExponentialBackoffDataHolder(new Da(C5468ua.H.z(), enumC4964ae), enumC4964ae.name());
                linkedHashMap.put(enumC4964ae, exponentialBackoffDataHolder);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (ExponentialBackoffDataHolder) exponentialBackoffDataHolder;
    }

    public static final NetworkTask a(C5058e5 c5058e5) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C5070eh c5070eh = new C5070eh(aESRSARequestBodyEncrypter);
        Fb fb2 = new Fb(c5058e5);
        return new NetworkTask(new BlockingExecutor(), new C5513w5(c5058e5.f77062a), new AllHostsExponentialBackoffPolicy(f76966a.a(EnumC4964ae.REPORT)), new C5600zh(c5058e5, c5070eh, fb2, new FullUrlFormer(c5070eh, fb2), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), c5058e5.i(), c5058e5.p(), c5058e5.u(), aESRSARequestBodyEncrypter), CollectionsKt.listOf(new mo()), f76968c);
    }
}
