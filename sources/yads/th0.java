package yads;

import com.yandex.div.DivDataTag;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.CachingTemplateProvider;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class th0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm2 f116245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pg0 f116246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rg0 f116247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh0 f116248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zm f116249e;

    public /* synthetic */ th0(dm2 dm2Var) {
        this(dm2Var, new pg0(dm2Var), new rg0(), new qh0(), new zm());
    }

    public final oh0 a(gf0 gf0Var, boolean z10) {
        k8.ea eaVarA;
        mf0[] mf0VarArr = mf0.f113454b;
        CachingTemplateProvider cachingTemplateProvider = null;
        byte b10 = 0;
        if (Intrinsics.areEqual("divkit", gf0Var.f111173a)) {
            try {
                String str = gf0Var.f111174b;
                String strA = gf0Var.f111175c;
                if (z10) {
                    this.f116249e.getClass();
                    strA = zm.a(strA);
                }
                JSONObject jSONObject = new JSONObject(strA);
                JSONObject jSONObject2 = jSONObject.getJSONObject("card");
                JSONObject jSONObject3 = jSONObject.has("templates") ? jSONObject.getJSONObject("templates") : null;
                List list = gf0Var.f111176d;
                pg0 pg0Var = this.f116246b;
                pg0Var.getClass();
                try {
                    ai0 ai0Var = pg0Var.f114668b;
                    ParsingErrorLogger parsingErrorLogger = ParsingErrorLogger.LOG;
                    ai0Var.getClass();
                    DivParsingEnvironment divParsingEnvironment = new DivParsingEnvironment(parsingErrorLogger, cachingTemplateProvider, 2, b10 == true ? 1 : 0);
                    if (jSONObject3 != null) {
                        divParsingEnvironment.parseTemplates(jSONObject3);
                    }
                    pg0Var.f114669c.getClass();
                    eaVarA = k8.ea.f87200j.a(divParsingEnvironment, jSONObject2);
                } catch (Throwable th2) {
                    pg0Var.f114667a.reportError("Failed to create DivData", th2);
                    eaVarA = null;
                }
                this.f116247c.getClass();
                DivDataTag divDataTag = new DivDataTag(UUID.randomUUID().toString());
                Set setA = this.f116248d.a(jSONObject2);
                if (eaVarA != null) {
                    return new oh0(str, jSONObject2, jSONObject3, list, eaVarA, divDataTag, setA);
                }
            } catch (Throwable th3) {
                this.f116245a.reportError("Failed to parse DivKit design", th3);
            }
        }
        return null;
    }

    public th0(dm2 dm2Var, pg0 pg0Var, rg0 rg0Var, qh0 qh0Var, zm zmVar) {
        this.f116245a = dm2Var;
        this.f116246b = pg0Var;
        this.f116247c = rg0Var;
        this.f116248d = qh0Var;
        this.f116249e = zmVar;
    }
}
