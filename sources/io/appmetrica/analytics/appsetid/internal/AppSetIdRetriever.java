package io.appmetrica.analytics.appsetid.internal;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/appsetid/internal/AppSetIdRetriever;", "Lio/appmetrica/analytics/appsetid/internal/IAppSetIdRetriever;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lio/appmetrica/analytics/appsetid/internal/AppSetIdListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "retrieveAppSetId", "<init>", "()V", "appsetid_release"}, k = 1, mv = {1, 6, 0})
public final class AppSetIdRetriever implements IAppSetIdRetriever {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f74950a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f74951b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i10) {
        appSetIdRetriever.getClass();
        return i10 != 1 ? i10 != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER : AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(@NotNull Context context, @NotNull final AppSetIdListener listener) throws Throwable {
        Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(context).getAppSetIdInfo();
        OnCompleteListener<AppSetIdInfo> onCompleteListener = new OnCompleteListener<AppSetIdInfo>() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@NotNull Task<AppSetIdInfo> completedTask) {
                Object obj = this.f74952a.f74950a;
                AppSetIdRetriever appSetIdRetriever = this.f74952a;
                synchronized (obj) {
                    appSetIdRetriever.f74951b.remove(this);
                }
                if (completedTask.isSuccessful()) {
                    listener.onAppSetIdRetrieved(completedTask.getResult().getId(), AppSetIdRetriever.access$convertScope(this.f74952a, completedTask.getResult().getScope()));
                } else {
                    listener.onFailure(completedTask.getException());
                }
            }
        };
        synchronized (this.f74950a) {
            this.f74951b.add(onCompleteListener);
        }
        appSetIdInfo.addOnCompleteListener(onCompleteListener);
    }
}
