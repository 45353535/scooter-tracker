package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import androidx.constraintlayout.core.dsl.Helper;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends Helper {
    private Constraint.Side mDirection;
    private int mMargin;
    private ArrayList<Ref> references;

    public Barrier(String str) {
        super(str, new Helper.HelperType(Helper.typeMap.get(Helper.Type.BARRIER)));
        this.mDirection = null;
        this.mMargin = Integer.MIN_VALUE;
        this.references = new ArrayList<>();
    }

    public Barrier addReference(Ref ref) {
        this.references.add(ref);
        this.configMap.put("contains", referencesToString());
        return this;
    }

    public Constraint.Side getDirection() {
        return this.mDirection;
    }

    public int getMargin() {
        return this.mMargin;
    }

    public String referencesToString() {
        if (this.references.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(C4240b4.j.f42672d);
        Iterator<Ref> it = this.references.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
        }
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }

    public void setDirection(Constraint.Side side) {
        this.mDirection = side;
        this.configMap.put("direction", Helper.sideMap.get(side));
    }

    public void setMargin(int i10) {
        this.mMargin = i10;
        this.configMap.put("margin", String.valueOf(i10));
    }

    public Barrier addReference(String str) {
        return addReference(Ref.parseStringToRef(str));
    }

    public Barrier(String str, String str2) {
        super(str, new Helper.HelperType(Helper.typeMap.get(Helper.Type.BARRIER)), str2);
        this.mDirection = null;
        this.mMargin = Integer.MIN_VALUE;
        this.references = new ArrayList<>();
        Map<String, String> mapConvertConfigToMap = convertConfigToMap();
        this.configMap = mapConvertConfigToMap;
        if (mapConvertConfigToMap.containsKey("contains")) {
            Ref.addStringToReferences(this.configMap.get("contains"), this.references);
        }
    }
}
