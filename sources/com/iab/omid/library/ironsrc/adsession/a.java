package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.internal.c;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.internal.f;
import com.iab.omid.library.ironsrc.internal.i;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.b;
import com.iab.omid.library.ironsrc.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f35269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f35270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f35271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.weakreference.a f35272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f35273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f35276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f35279k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f35277i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f35278j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f35275g) {
            return;
        }
        this.f35271c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f35272d.get();
    }

    public List<e> d() {
        return this.f35271c.a();
    }

    public boolean e() {
        return this.f35279k != null;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f35275g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f35274f && !this.f35275g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.f35275g) {
            return;
        }
        this.f35272d.clear();
        removeAllFriendlyObstructions();
        this.f35275g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f35273e = null;
        this.f35279k = null;
    }

    public boolean g() {
        return this.f35275g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public String getAdSessionId() {
        return this.f35276h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f35273e;
    }

    public boolean h() {
        return this.f35270b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f35270b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f35274f;
    }

    void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f35277i = true;
    }

    void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f35278j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f35275g || c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f35275g) {
            return;
        }
        this.f35271c.b();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f35275g) {
            return;
        }
        this.f35271c.c(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f35279k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f35274f || this.f35273e == null) {
            return;
        }
        this.f35274f = true;
        c.c().c(this);
        this.f35273e.a(i.c().b());
        this.f35273e.a(com.iab.omid.library.ironsrc.internal.a.a().b());
        this.f35273e.a(this, this.f35269a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f35271c = new f();
        this.f35274f = false;
        this.f35275g = false;
        this.f35270b = adSessionConfiguration;
        this.f35269a = adSessionContext;
        this.f35276h = str;
        b(null);
        this.f35273e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.ironsrc.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f35273e.i();
        c.c().a(this);
        this.f35273e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f35272d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f35272d = new com.iab.omid.library.ironsrc.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.ironsrc.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.ironsrc.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f35279k.onPossibleObstructionsDetected(this.f35276h, arrayList);
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f35278j = true;
    }
}
