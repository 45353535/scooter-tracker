package com.google.firebase.sessions;

import android.content.Context;
import android.os.Process;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.sessions.ProcessDataManager;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00122\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010)\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010+\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b*\u0010\"R\u001b\u0010.\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010/¨\u00061"}, d2 = {"Lcom/google/firebase/sessions/ProcessDataManagerImpl;", "Lcom/google/firebase/sessions/ProcessDataManager;", "Landroid/content/Context;", "appContext", "Lcom/google/firebase/sessions/UuidGenerator;", "uuidGenerator", "<init>", "(Landroid/content/Context;Lcom/google/firebase/sessions/UuidGenerator;)V", "", "Lcom/google/firebase/sessions/ProcessDetails;", "d", "()Ljava/util/List;", "processDetails", "Lcom/google/firebase/sessions/ProcessData;", "processData", "", InneractiveMediationDefs.GENDER_FEMALE, "(Lcom/google/firebase/sessions/ProcessDetails;Lcom/google/firebase/sessions/ProcessData;)Z", "", "", "processDataMap", "isColdStart", "(Ljava/util/Map;)Z", "isMyProcessStale", "", "onSessionGenerated", "()V", "updateProcessDataMap", "(Ljava/util/Map;)Ljava/util/Map;", "a", "Landroid/content/Context;", "b", "Lkotlin/Lazy;", "getMyProcessName", "()Ljava/lang/String;", "myProcessName", "", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "I", "getMyPid", "()I", "myPid", "getMyUuid", "myUuid", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()Lcom/google/firebase/sessions/ProcessDetails;", "myProcessDetails", "Z", "hasGeneratedSession", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessDataManagerImpl implements ProcessDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy myProcessName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int myPid;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy myUuid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy myProcessDetails;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasGeneratedSession;

    public ProcessDataManagerImpl(@NotNull Context appContext, @NotNull final UuidGenerator uuidGenerator) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.appContext = appContext;
        this.myProcessName = lf.i.a(new Function0() { // from class: com.google.firebase.sessions.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProcessDataManagerImpl.h(this.f33443b);
            }
        });
        this.myPid = Process.myPid();
        this.myUuid = lf.i.a(new Function0() { // from class: com.google.firebase.sessions.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProcessDataManagerImpl.i(uuidGenerator);
            }
        });
        this.myProcessDetails = lf.i.a(new Function0() { // from class: com.google.firebase.sessions.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProcessDataManagerImpl.g(this.f33445b);
            }
        });
    }

    private final List d() {
        return ProcessDetailsProvider.INSTANCE.getAppProcessDetails(this.appContext);
    }

    private final ProcessDetails e() {
        return (ProcessDetails) this.myProcessDetails.getValue();
    }

    private final boolean f(ProcessDetails processDetails, ProcessData processData) {
        return Intrinsics.areEqual(getMyProcessName(), processDetails.getProcessName()) ? (processDetails.getPid() == processData.getPid() && Intrinsics.areEqual(getMyUuid(), processData.getUuid())) ? false : true : processDetails.getPid() != processData.getPid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProcessDetails g(ProcessDataManagerImpl processDataManagerImpl) {
        return ProcessDetailsProvider.INSTANCE.getMyProcessDetails(processDataManagerImpl.appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(ProcessDataManagerImpl processDataManagerImpl) {
        return processDataManagerImpl.e().getProcessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(UuidGenerator uuidGenerator) {
        String string = uuidGenerator.next().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    @NotNull
    public Map<String, ProcessData> generateProcessDataMap() {
        return ProcessDataManager.DefaultImpls.generateProcessDataMap(this);
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public int getMyPid() {
        return this.myPid;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    @NotNull
    public String getMyProcessName() {
        return (String) this.myProcessName.getValue();
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    @NotNull
    public String getMyUuid() {
        return (String) this.myUuid.getValue();
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public boolean isColdStart(@NotNull Map<String, ProcessData> processDataMap) {
        Intrinsics.checkNotNullParameter(processDataMap, "processDataMap");
        if (this.hasGeneratedSession) {
            return false;
        }
        List<ProcessDetails> listD = d();
        ArrayList<Pair> arrayList = new ArrayList();
        for (ProcessDetails processDetails : listD) {
            ProcessData processData = processDataMap.get(processDetails.getProcessName());
            Pair pair = processData != null ? new Pair(processDetails, processData) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (Pair pair2 : arrayList) {
            if (!f((ProcessDetails) pair2.component1(), (ProcessData) pair2.component2())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public boolean isMyProcessStale(@NotNull Map<String, ProcessData> processDataMap) {
        Intrinsics.checkNotNullParameter(processDataMap, "processDataMap");
        ProcessData processData = processDataMap.get(getMyProcessName());
        return (processData != null && processData.getPid() == getMyPid() && Intrinsics.areEqual(processData.getUuid(), getMyUuid())) ? false : true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public void onSessionGenerated() {
        this.hasGeneratedSession = true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    @NotNull
    public Map<String, ProcessData> updateProcessDataMap(@Nullable Map<String, ProcessData> processDataMap) {
        Map mutableMap;
        if (processDataMap != null && (mutableMap = MapsKt.toMutableMap(processDataMap)) != null) {
            mutableMap.put(getMyProcessName(), new ProcessData(Process.myPid(), getMyUuid()));
            Map<String, ProcessData> map = MapsKt.toMap(mutableMap);
            if (map != null) {
                return map;
            }
        }
        return MapsKt.mapOf(TuplesKt.to(getMyProcessName(), new ProcessData(Process.myPid(), getMyUuid())));
    }
}
