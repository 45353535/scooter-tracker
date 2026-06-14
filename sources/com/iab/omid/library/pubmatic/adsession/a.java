package com.iab.omid.library.pubmatic.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubmatic.internal.c;
import com.iab.omid.library.pubmatic.internal.e;
import com.iab.omid.library.pubmatic.internal.f;
import com.iab.omid.library.pubmatic.internal.i;
import com.iab.omid.library.pubmatic.publisher.AdSessionStatePublisher;
import com.iab.omid.library.pubmatic.publisher.b;
import com.iab.omid.library.pubmatic.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f35674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f35675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f35676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.pubmatic.weakreference.a f35677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f35678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f35681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f35684k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f35682i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f35683j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f35680g) {
            return;
        }
        this.f35676c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f35681h;
    }

    public AdSessionStatePublisher d() {
        return this.f35678e;
    }

    public View e() {
        return this.f35677d.get();
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f35680g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f35676c.a();
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void finish() {
        if (this.f35680g) {
            return;
        }
        this.f35677d.clear();
        removeAllFriendlyObstructions();
        this.f35680g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f35678e = null;
        this.f35684k = null;
    }

    public boolean g() {
        return this.f35684k != null;
    }

    public boolean h() {
        return this.f35679f && !this.f35680g;
    }

    public boolean i() {
        return this.f35680g;
    }

    public boolean j() {
        return this.f35675b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f35675b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f35679f;
    }

    void m() {
        a();
        d().g();
        this.f35682i = true;
    }

    void n() {
        b();
        d().h();
        this.f35683j = true;
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f35680g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f35680g) {
            return;
        }
        this.f35676c.b();
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f35680g) {
            return;
        }
        this.f35676c.c(view);
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f35684k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void start() {
        if (this.f35679f || this.f35678e == null) {
            return;
        }
        this.f35679f = true;
        c.c().c(this);
        this.f35678e.a(i.c().b());
        this.f35678e.a(com.iab.omid.library.pubmatic.internal.a.a().b());
        this.f35678e.a(this, this.f35674a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f35676c = new f();
        this.f35679f = false;
        this.f35680g = false;
        this.f35675b = adSessionConfiguration;
        this.f35674a = adSessionContext;
        this.f35681h = str;
        b(null);
        this.f35678e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.pubmatic.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f35678e.i();
        c.c().a(this);
        this.f35678e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f35677d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f35677d = new com.iab.omid.library.pubmatic.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.pubmatic.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.pubmatic.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f35684k.onPossibleObstructionsDetected(this.f35681h, arrayList);
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f35683j = true;
    }
}
