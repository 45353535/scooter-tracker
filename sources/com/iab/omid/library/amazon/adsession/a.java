package com.iab.omid.library.amazon.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.amazon.internal.c;
import com.iab.omid.library.amazon.internal.e;
import com.iab.omid.library.amazon.internal.f;
import com.iab.omid.library.amazon.internal.i;
import com.iab.omid.library.amazon.publisher.AdSessionStatePublisher;
import com.iab.omid.library.amazon.publisher.b;
import com.iab.omid.library.amazon.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f34088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f34089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f34090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.amazon.weakreference.a f34091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f34092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f34093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f34095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f34098k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f34096i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f34097j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f34094g) {
            return;
        }
        this.f34090c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f34091d.get();
    }

    public List<e> d() {
        return this.f34090c.a();
    }

    public boolean e() {
        return this.f34098k != null;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f34094g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f34093f && !this.f34094g;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void finish() {
        if (this.f34094g) {
            return;
        }
        this.f34091d.clear();
        removeAllFriendlyObstructions();
        this.f34094g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f34092e = null;
        this.f34098k = null;
    }

    public boolean g() {
        return this.f34094g;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public String getAdSessionId() {
        return this.f34095h;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f34092e;
    }

    public boolean h() {
        return this.f34089b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f34089b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f34093f;
    }

    void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f34096i = true;
    }

    void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f34097j = true;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f34094g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f34094g) {
            return;
        }
        this.f34090c.b();
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f34094g) {
            return;
        }
        this.f34090c.c(view);
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f34098k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void start() {
        if (this.f34093f) {
            return;
        }
        this.f34093f = true;
        c.c().c(this);
        this.f34092e.a(i.c().b());
        this.f34092e.a(com.iab.omid.library.amazon.internal.a.a().b());
        this.f34092e.a(this, this.f34088a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f34090c = new f();
        this.f34093f = false;
        this.f34094g = false;
        this.f34089b = adSessionConfiguration;
        this.f34088a = adSessionContext;
        this.f34095h = str;
        b(null);
        this.f34092e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.amazon.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f34092e.i();
        c.c().a(this);
        this.f34092e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f34091d.clear();
            }
        }
    }

    private void b(View view) {
        this.f34091d = new com.iab.omid.library.amazon.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.amazon.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.amazon.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f34098k.onPossibleObstructionsDetected(this.f34095h, arrayList);
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f34097j = true;
    }
}
