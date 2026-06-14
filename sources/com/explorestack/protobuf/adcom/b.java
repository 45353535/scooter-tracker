package com.explorestack.protobuf.adcom;

import androidx.compose.material.TextFieldImplKt;
import androidx.exifinterface.media.ExifInterface;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.f;
import com.explorestack.protobuf.f2;
import com.explorestack.protobuf.h0;
import com.google.common.net.HttpHeaders;
import com.taurusx.tax.f.y;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    static final Descriptors.Descriptor A;
    static final Descriptors.Descriptor A0;
    static final h0.f B;
    static final h0.f B0;
    static final Descriptors.Descriptor C;
    static final Descriptors.Descriptor C0;
    static final h0.f D;
    static final h0.f D0;
    static final Descriptors.Descriptor E;
    private static Descriptors.FileDescriptor E0 = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n%bidmachine/protobuf/adcom/adcom.proto\u0012\u0019bidmachine.protobuf.adcom\u001a\u0019google/protobuf/any.proto\u001a\u001cgoogle/protobuf/struct.proto\"¸#\n\u0007Context\u00123\n\u0003app\u0018\u0001 \u0001(\u000b2&.bidmachine.protobuf.adcom.Context.App\u00129\n\u0006device\u0018\u0002 \u0001(\u000b2).bidmachine.protobuf.adcom.Context.Device\u00125\n\u0004regs\u0018\u0003 \u0001(\u000b2'.bidmachine.protobuf.adcom.Context.Regs\u0012E\n\frestrictions\u0018\u0004 \u0001(\u000b2/.bidmachine.protobuf.adcom.Context.Restrictions\u00125\n\u0004user\u0018\u0005 \u0001(\u000b2'.bidmachine.protobuf.adcom.Context.User\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001aò\r\n\u0003App\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012=\n\u0003pub\u0018\u0003 \u0001(\u000b20.bidmachine.protobuf.adcom.Context.App.Publisher\u0012?\n\u0007content\u0018\u0004 \u0001(\u000b2..bidmachine.protobuf.adcom.Context.App.Content\u0012\u000e\n\u0006domain\u0018\u0005 \u0001(\t\u0012\u000b\n\u0003cat\u0018\u0006 \u0003(\t\u0012\u000f\n\u0007sectcat\u0018\u0007 \u0003(\t\u0012\u000f\n\u0007pagecat\u0018\b \u0003(\t\u0012;\n\u0006cattax\u0018\t \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012\u0012\n\nprivpolicy\u0018\n \u0001(\b\u0012\u0010\n\bkeywords\u0018\u000b \u0001(\t\u0012\u000e\n\u0006bundle\u0018\f \u0001(\t\u0012\u000f\n\u0007storeid\u0018\r \u0001(\t\u0012\u0010\n\bstoreurl\u0018\u000e \u0001(\t\u0012\u000b\n\u0003ver\u0018\u000f \u0001(\t\u0012\f\n\u0004paid\u0018\u0010 \u0001(\b\u0012?\n\u0007release\u0018\u0013 \u0001(\u000b2..bidmachine.protobuf.adcom.Context.App.Release\u0012$\n\u0003ext\u0018\u0012 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0011 \u0003(\u000b2\u0014.google.protobuf.Any\u001aÎ\u0001\n\tPublisher\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006domain\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003cat\u0018\u0004 \u0003(\t\u0012;\n\u0006cattax\u0018\u0005 \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001a¶\u0007\n\u0007Content\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007episode\u0018\u0002 \u0001(\r\u0012\r\n\u0005title\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006series\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006season\u0018\u0005 \u0001(\t\u0012\u000e\n\u0006artist\u0018\u0006 \u0001(\t\u0012\r\n\u0005genre\u0018\u0007 \u0001(\t\u0012\r\n\u0005album\u0018\b \u0001(\t\u0012\f\n\u0004isrc\u0018\t \u0001(\t\u0012\u000b\n\u0003url\u0018\n \u0001(\t\u0012\u000b\n\u0003cat\u0018\u000b \u0003(\t\u0012;\n\u0006cattax\u0018\f \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012;\n\u0005prodq\u0018\r \u0001(\u000e2,.bidmachine.protobuf.adcom.ProductionQuality\u0012:\n\u0007context\u0018\u000e \u0001(\u000e2).bidmachine.protobuf.adcom.ContentContext\u0012\u000e\n\u0006rating\u0018\u000f \u0001(\t\u0012\u000f\n\u0007urating\u0018\u0010 \u0001(\t\u00127\n\u0007mrating\u0018\u0011 \u0001(\u000e2&.bidmachine.protobuf.adcom.MediaRating\u0012\u0010\n\bkeywords\u0018\u0012 \u0001(\t\u0012\f\n\u0004live\u0018\u0013 \u0001(\b\u0012\u000e\n\u0006srcrel\u0018\u0014 \u0001(\r\u0012\u000b\n\u0003len\u0018\u0015 \u0001(\r\u0012\f\n\u0004lang\u0018\u0016 \u0001(\t\u0012\r\n\u0005embed\u0018\u0017 \u0001(\b\u0012I\n\bproducer\u0018\u0018 \u0001(\u000b27.bidmachine.protobuf.adcom.Context.App.Content.Producer\u00125\n\u0004data\u0018\u0019 \u0003(\u000b2'.bidmachine.protobuf.adcom.Context.Data\u0012$\n\u0003ext\u0018\u001b \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u001a \u0003(\u000b2\u0014.google.protobuf.Any\u001aÍ\u0001\n\bProducer\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006domain\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003cat\u0018\u0004 \u0003(\t\u0012;\n\u0006cattax\u0018\u0005 \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001aG\n\u0007Release\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u0012\u0015\n\rsignatureSHA1\u0018\u0002 \u0001(\t\u0012\u0017\n\u000fsignatureSHA256\u0018\u0003 \u0001(\t\u001aµ\u0002\n\u0004Data\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012@\n\u0007segment\u0018\u0003 \u0003(\u000b2/.bidmachine.protobuf.adcom.Context.Data.Segment\u0012$\n\u0003ext\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0004 \u0003(\u000b2\u0014.google.protobuf.Any\u001a\u0081\u0001\n\u0007Segment\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\r\n\u0005value\u0018\u0003 \u0001(\t\u0012$\n\u0003ext\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0004 \u0003(\u000b2\u0014.google.protobuf.Any\u001aá\u0002\n\u0003Geo\u00125\n\u0004type\u0018\u0001 \u0001(\u000e2'.bidmachine.protobuf.adcom.LocationType\u0012\u000b\n\u0003lat\u0018\u0002 \u0001(\u0002\u0012\u000b\n\u0003lon\u0018\u0003 \u0001(\u0002\u0012\r\n\u0005accur\u0018\u0004 \u0001(\r\u0012\u000f\n\u0007lastfix\u0018\u0005 \u0001(\u0004\u0012<\n\u0006ipserv\u0018\u0006 \u0001(\u000e2,.bidmachine.protobuf.adcom.IpLocationService\u0012\u000f\n\u0007country\u0018\u0007 \u0001(\t\u0012\u000e\n\u0006region\u0018\b \u0001(\t\u0012\r\n\u0005metro\u0018\t \u0001(\t\u0012\f\n\u0004city\u0018\n \u0001(\t\u0012\u000b\n\u0003zip\u0018\u000b \u0001(\t\u0012\u0011\n\tutcoffset\u0018\f \u0001(\u0005\u0012$\n\u0003ext\u0018\u000e \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\r \u0003(\u000b2\u0014.google.protobuf.Any\u001aî\u0007\n\u0006Device\u00123\n\u0004type\u0018\u0001 \u0001(\u000e2%.bidmachine.protobuf.adcom.DeviceType\u0012\n\n\u0002ua\u0018\u0002 \u0001(\t\u0012\u000b\n\u0003ifa\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003dnt\u0018\u0004 \u0001(\b\u0012\u000b\n\u0003lmt\u0018\u0005 \u0001(\b\u0012\f\n\u0004make\u0018\u0006 \u0001(\t\u0012\r\n\u0005model\u0018\u0007 \u0001(\t\u0012)\n\u0002os\u0018\b \u0001(\u000e2\u001d.bidmachine.protobuf.adcom.OS\u0012\u000b\n\u0003osv\u0018\t \u0001(\t\u0012\u000b\n\u0003hwv\u0018\n \u0001(\t\u0012\t\n\u0001h\u0018\u000b \u0001(\r\u0012\t\n\u0001w\u0018\f \u0001(\r\u0012\u000b\n\u0003ppi\u0018\r \u0001(\r\u0012\u000f\n\u0007pxratio\u0018\u000e \u0001(\u0002\u0012\n\n\u0002js\u0018\u000f \u0001(\b\u0012\f\n\u0004lang\u0018\u0010 \u0001(\t\u0012\n\n\u0002ip\u0018\u0011 \u0001(\t\u0012\f\n\u0004ipv6\u0018\u0012 \u0001(\t\u0012\u000b\n\u0003xff\u0018\u0013 \u0001(\t\u0012\f\n\u0004iptr\u0018\u0014 \u0001(\b\u0012\u000f\n\u0007carrier\u0018\u0015 \u0001(\t\u0012\u000e\n\u0006mccmnc\u0018\u0016 \u0001(\t\u0012\u0011\n\tmccmncsim\u0018\u0017 \u0001(\t\u0012:\n\u0007contype\u0018\u0018 \u0001(\u000e2).bidmachine.protobuf.adcom.ConnectionType\u0012\u0010\n\bgeofetch\u0018\u0019 \u0001(\b\u00123\n\u0003geo\u0018\u001a \u0001(\u000b2&.bidmachine.protobuf.adcom.Context.Geo\u0012H\n\nconnection\u0018\u001d \u0001(\u000b24.bidmachine.protobuf.adcom.Context.Device.Connection\u0012L\n\faudioContext\u0018\u001e \u0001(\u000b26.bidmachine.protobuf.adcom.Context.Device.AudioContext\u0012$\n\u0003ext\u0018\u001c \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u001b \u0003(\u000b2\u0014.google.protobuf.Any\u001a»\u0001\n\nConnection\u00127\n\u0004type\u0018\u0001 \u0001(\u000e2).bidmachine.protobuf.adcom.ConnectionType\u0012:\n\u0005proxy\u0018\u0002 \u0001(\u000e2+.bidmachine.protobuf.adcom.ConnectionStatus\u00128\n\u0003vpn\u0018\u0003 \u0001(\u000e2+.bidmachine.protobuf.adcom.ConnectionStatus\u001a;\n\fAudioContext\u0012\u0016\n\u000eisAudioPlaying\u0018\u0001 \u0001(\b\u0012\u0013\n\u000bvolumelevel\u0018\u0002 \u0001(\u0002\u001a\u0090\u0001\n\u0004Regs\u0012\r\n\u0005coppa\u0018\u0001 \u0001(\b\u0012\f\n\u0004gdpr\u0018\u0002 \u0001(\b\u0012\u000b\n\u0003gpp\u0018\u0005 \u0001(\t\u0012\u000f\n\u0007gpp_sid\u0018\u0006 \u0003(\r\u0012$\n\u0003ext\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.Any\u001a\u0081\u0002\n\fRestrictions\u0012\f\n\u0004bcat\u0018\u0001 \u0003(\t\u0012;\n\u0006cattax\u0018\u0002 \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012\f\n\u0004badv\u0018\u0003 \u0003(\t\u0012\f\n\u0004bapp\u0018\u0004 \u0003(\t\u0012;\n\u0005battr\u0018\u0005 \u0003(\u000e2,.bidmachine.protobuf.adcom.CreativeAttribute\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001a\u009f\u0002\n\u0004User\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u0010\n\bbuyeruid\u0018\u0002 \u0001(\t\u0012\u000b\n\u0003yob\u0018\u0003 \u0001(\r\u0012\u000e\n\u0006gender\u0018\u0004 \u0001(\t\u0012\u0010\n\bkeywords\u0018\u0005 \u0001(\t\u0012\u000f\n\u0007consent\u0018\u0006 \u0001(\t\u00123\n\u0003geo\u0018\u0007 \u0001(\u000b2&.bidmachine.protobuf.adcom.Context.Geo\u00125\n\u0004data\u0018\b \u0003(\u000b2'.bidmachine.protobuf.adcom.Context.Data\u0012$\n\u0003ext\u0018\n \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\t \u0003(\u000b2\u0014.google.protobuf.Any\"Ï\"\n\tPlacement\u0012\r\n\u0005tagid\u0018\u0001 \u0001(\t\u0012\f\n\u0004ssai\u0018\u0002 \u0001(\r\u0012\u000b\n\u0003sdk\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006sdkver\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006reward\u0018\u0005 \u0001(\b\u0012\f\n\u0004bcat\u0018\u0006 \u0003(\t\u0012;\n\u0006cattax\u0018\u0007 \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012\f\n\u0004badv\u0018\t \u0003(\t\u0012\f\n\u0004bapp\u0018\n \u0003(\t\u0012;\n\u0005battr\u0018\u000b \u0003(\u000e2,.bidmachine.protobuf.adcom.CreativeAttribute\u0012\r\n\u0005wlang\u0018\f \u0003(\t\u0012\u000e\n\u0006secure\u0018\r \u0001(\b\u0012\f\n\u0004admx\u0018\u000e \u0001(\b\u0012\r\n\u0005curlx\u0018\u000f \u0001(\b\u0012F\n\u0007display\u0018\u0010 \u0001(\u000b25.bidmachine.protobuf.adcom.Placement.DisplayPlacement\u0012B\n\u0005video\u0018\u0011 \u0001(\u000b23.bidmachine.protobuf.adcom.Placement.VideoPlacement\u0012$\n\u0003ext\u0018\u0014 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0013 \u0003(\u000b2\u0014.google.protobuf.Any\u001aí\u0014\n\u0010DisplayPlacement\u00129\n\u0003pos\u0018\u0001 \u0001(\u000e2,.bidmachine.protobuf.adcom.PlacementPosition\u0012\r\n\u0005instl\u0018\u0002 \u0001(\b\u0012\u0010\n\btopframe\u0018\u0003 \u0001(\b\u0012\u000f\n\u0007ifrbust\u0018\u0004 \u0003(\t\u00125\n\u0007clktype\u0018\u0005 \u0001(\u000e2$.bidmachine.protobuf.adcom.ClickType\u0012\u000e\n\u0006ampren\u0018\u0006 \u0001(\r\u0012>\n\u0005ptype\u0018\u0007 \u0001(\u000e2/.bidmachine.protobuf.adcom.DisplayPlacementType\u0012>\n\u0007context\u0018\b \u0001(\u000e2-.bidmachine.protobuf.adcom.DisplayContextType\u0012\f\n\u0004mime\u0018\t \u0003(\t\u00124\n\u0003api\u0018\n \u0003(\u000e2'.bidmachine.protobuf.adcom.ApiFramework\u0012=\n\u0005ctype\u0018\u000b \u0003(\u000e2..bidmachine.protobuf.adcom.DisplayCreativeType\u0012\t\n\u0001w\u0018\f \u0001(\r\u0012\t\n\u0001h\u0018\r \u0001(\r\u00121\n\u0004unit\u0018\u000e \u0001(\u000e2#.bidmachine.protobuf.adcom.SizeUnit\u0012\f\n\u0004priv\u0018\u000f \u0001(\b\u0012W\n\ndisplayfmt\u0018\u0010 \u0003(\u000b2C.bidmachine.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat\u0012U\n\tnativefmt\u0018\u0011 \u0001(\u000b2B.bidmachine.protobuf.adcom.Placement.DisplayPlacement.NativeFormat\u0012N\n\u0005event\u0018\u0012 \u0003(\u000b2?.bidmachine.protobuf.adcom.Placement.DisplayPlacement.EventSpec\u0012$\n\u0003ext\u0018\u0014 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0013 \u0003(\u000b2\u0014.google.protobuf.Any\u001aÔ\u0001\n\rDisplayFormat\u0012\t\n\u0001w\u0018\u0001 \u0001(\r\u0012\t\n\u0001h\u0018\u0002 \u0001(\r\u0012\u000e\n\u0006wratio\u0018\u0003 \u0001(\r\u0012\u000e\n\u0006hratio\u0018\u0004 \u0001(\r\u0012>\n\u0006expdir\u0018\u0005 \u0003(\u000e2..bidmachine.protobuf.adcom.ExpandableDirection\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001aå\t\n\fNativeFormat\u0012]\n\u0005asset\u0018\u0001 \u0003(\u000b2N.bidmachine.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat\u0012$\n\u0003ext\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0002 \u0003(\u000b2\u0014.google.protobuf.Any\u001a¦\b\n\u000bAssetFormat\u0012\n\n\u0002id\u0018\u0001 \u0001(\r\u0012\u000b\n\u0003req\u0018\u0002 \u0001(\b\u0012n\n\u0005title\u0018\u0003 \u0001(\u000b2_.bidmachine.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat\u0012l\n\u0003img\u0018\u0004 \u0001(\u000b2_.bidmachine.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat\u0012B\n\u0005video\u0018\u0005 \u0001(\u000b23.bidmachine.protobuf.adcom.Placement.VideoPlacement\u0012l\n\u0004data\u0018\u0006 \u0001(\u000b2^.bidmachine.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat\u0012$\n\u0003ext\u0018\b \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0007 \u0003(\u000b2\u0014.google.protobuf.Any\u001an\n\u0010TitleAssetFormat\u0012\u000b\n\u0003len\u0018\u0001 \u0001(\r\u0012$\n\u0003ext\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0002 \u0003(\u000b2\u0014.google.protobuf.Any\u001a\u0080\u0002\n\u0010ImageAssetFormat\u0012=\n\u0004type\u0018\u0001 \u0001(\u000e2/.bidmachine.protobuf.adcom.NativeImageAssetType\u0012\f\n\u0004mime\u0018\u0002 \u0003(\t\u0012\t\n\u0001w\u0018\u0003 \u0001(\r\u0012\t\n\u0001h\u0018\u0004 \u0001(\r\u0012\f\n\u0004wmin\u0018\u0005 \u0001(\r\u0012\f\n\u0004hmin\u0018\u0006 \u0001(\r\u0012\u000e\n\u0006wratio\u0018\u0007 \u0001(\r\u0012\u000e\n\u0006hratio\u0018\b \u0001(\r\u0012$\n\u0003ext\u0018\n \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\t \u0003(\u000b2\u0014.google.protobuf.Any\u001a«\u0001\n\u000fDataAssetFormat\u0012<\n\u0004type\u0018\u0001 \u0001(\u000e2..bidmachine.protobuf.adcom.NativeDataAssetType\u0012\u000b\n\u0003len\u0018\u0002 \u0001(\r\u0012$\n\u0003ext\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.Any\u001a¼\u0002\n\tEventSpec\u00122\n\u0004type\u0018\u0001 \u0001(\u000e2$.bidmachine.protobuf.adcom.EventType\u0012>\n\u0006method\u0018\u0002 \u0003(\u000e2..bidmachine.protobuf.adcom.EventTrackingMethod\u00124\n\u0003api\u0018\u0003 \u0003(\u000e2'.bidmachine.protobuf.adcom.ApiFramework\u0012\r\n\u0005jstrk\u0018\u0004 \u0003(\t\u0012\u000b\n\u0003wjs\u0018\u0005 \u0001(\b\u0012\r\n\u0005pxtrk\u0018\u0006 \u0003(\t\u0012\u000b\n\u0003wpx\u0018\u0007 \u0001(\b\u0012$\n\u0003ext\u0018\t \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\b \u0003(\u000b2\u0014.google.protobuf.Any\u001aÌ\t\n\u000eVideoPlacement\u0012<\n\u0005ptype\u0018\u0001 \u0001(\u000e2-.bidmachine.protobuf.adcom.VideoPlacementType\u00129\n\u0003pos\u0018\u0002 \u0001(\u000e2,.bidmachine.protobuf.adcom.PlacementPosition\u0012\r\n\u0005delay\u0018\u0003 \u0001(\u0005\u0012\f\n\u0004skip\u0018\u0004 \u0001(\b\u0012\u000f\n\u0007skipmin\u0018\u0005 \u0001(\r\u0012\u0011\n\tskipafter\u0018\u0006 \u0001(\r\u0012=\n\nplaymethod\u0018\u0007 \u0001(\u000e2).bidmachine.protobuf.adcom.PlaybackMethod\u0012A\n\u0007playend\u0018\b \u0001(\u000e20.bidmachine.protobuf.adcom.PlaybackCessationMode\u00125\n\u0007clktype\u0018\t \u0001(\u000e2$.bidmachine.protobuf.adcom.ClickType\u0012\f\n\u0004mime\u0018\n \u0003(\t\u00124\n\u0003api\u0018\u000b \u0003(\u000e2'.bidmachine.protobuf.adcom.ApiFramework\u0012;\n\u0005ctype\u0018\f \u0003(\u000e2,.bidmachine.protobuf.adcom.VideoCreativeType\u0012\t\n\u0001w\u0018\r \u0001(\r\u0012\t\n\u0001h\u0018\u000e \u0001(\r\u00121\n\u0004unit\u0018\u000f \u0001(\u000e2#.bidmachine.protobuf.adcom.SizeUnit\u0012\u000e\n\u0006mindur\u0018\u0010 \u0001(\r\u0012\u000e\n\u0006maxdur\u0018\u0011 \u0001(\r\u0012\u000e\n\u0006maxext\u0018\u0012 \u0001(\u0005\u0012\u000f\n\u0007minbitr\u0018\u0013 \u0001(\r\u0012\u000f\n\u0007maxbitr\u0018\u0014 \u0001(\r\u0012;\n\bdelivery\u0018\u0015 \u0003(\u000e2).bidmachine.protobuf.adcom.DeliveryMethod\u0012\u000e\n\u0006maxseq\u0018\u0016 \u0001(\r\u00128\n\u0006linear\u0018\u0017 \u0001(\u000e2(.bidmachine.protobuf.adcom.LinearityMode\u0012\u000e\n\u0006boxing\u0018\u0018 \u0001(\b\u0012K\n\u0004comp\u0018\u0019 \u0003(\u000b2=.bidmachine.protobuf.adcom.Placement.VideoPlacement.Companion\u0012:\n\bcomptype\u0018\u001a \u0003(\u000e2(.bidmachine.protobuf.adcom.CompanionType\u0012$\n\u0003ext\u0018\u001c \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u001b \u0003(\u000b2\u0014.google.protobuf.Any\u001a»\u0001\n\tCompanion\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003vcm\u0018\u0002 \u0001(\r\u0012F\n\u0007display\u0018\u0003 \u0001(\u000b25.bidmachine.protobuf.adcom.Placement.DisplayPlacement\u0012$\n\u0003ext\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0004 \u0003(\u000b2\u0014.google.protobuf.Any\"£\u001c\n\u0002Ad\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007adomain\u0018\u0002 \u0003(\t\u0012\u000e\n\u0006bundle\u0018\u0003 \u0003(\t\u0012\f\n\u0004iurl\u0018\u0004 \u0001(\t\u0012\u000b\n\u0003cat\u0018\u0005 \u0003(\t\u0012;\n\u0006cattax\u0018\u0006 \u0001(\u000e2+.bidmachine.protobuf.adcom.CategoryTaxonomy\u0012\f\n\u0004lang\u0018\u0007 \u0001(\t\u0012\u000e\n\u0006secure\u0018\t \u0001(\b\u00127\n\u0007mrating\u0018\n \u0001(\u000e2&.bidmachine.protobuf.adcom.MediaRating\u0012\f\n\u0004init\u0018\u000b \u0001(\t\u0012\u000f\n\u0007lastmod\u0018\f \u0001(\t\u00126\n\u0007display\u0018\r \u0001(\u000b2%.bidmachine.protobuf.adcom.Ad.Display\u00122\n\u0005video\u0018\u000e \u0001(\u000b2#.bidmachine.protobuf.adcom.Ad.Video\u00122\n\u0005audit\u0018\u0010 \u0001(\u000b2#.bidmachine.protobuf.adcom.Ad.Audit\u0012$\n\u0003ext\u0018\u0012 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0011 \u0003(\u000b2\u0014.google.protobuf.Any\u001aú\u0002\n\u0005Event\u00122\n\u0004type\u0018\u0001 \u0001(\u000e2$.bidmachine.protobuf.adcom.EventType\u0012>\n\u0006method\u0018\u0002 \u0001(\u000e2..bidmachine.protobuf.adcom.EventTrackingMethod\u00124\n\u0003api\u0018\u0003 \u0003(\u000e2'.bidmachine.protobuf.adcom.ApiFramework\u0012\u000b\n\u0003url\u0018\u0004 \u0001(\t\u0012=\n\u0005cdata\u0018\u0005 \u0003(\u000b2..bidmachine.protobuf.adcom.Ad.Event.CdataEntry\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001a,\n\nCdataEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001aÎ\u0011\n\u0007Display\u0012\f\n\u0004mime\u0018\u0001 \u0003(\t\u00124\n\u0003api\u0018\u0002 \u0003(\u000e2'.bidmachine.protobuf.adcom.ApiFramework\u0012<\n\u0004type\u0018\u0003 \u0003(\u000e2..bidmachine.protobuf.adcom.DisplayCreativeType\u0012\t\n\u0001w\u0018\u0004 \u0001(\r\u0012\t\n\u0001h\u0018\u0005 \u0001(\r\u0012\u000e\n\u0006wratio\u0018\u0006 \u0001(\r\u0012\u000e\n\u0006hratio\u0018\u0007 \u0001(\r\u0012\u000b\n\u0003adm\u0018\b \u0001(\t\u0012\f\n\u0004curl\u0018\t \u0001(\t\u0012<\n\u0006banner\u0018\n \u0001(\u000b2,.bidmachine.protobuf.adcom.Ad.Display.Banner\u0012<\n\u0006native\u0018\u000b \u0001(\u000b2,.bidmachine.protobuf.adcom.Ad.Display.Native\u00122\n\u0005event\u0018\f \u0003(\u000b2#.bidmachine.protobuf.adcom.Ad.Event\u0012$\n\u0003ext\u0018\u000e \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\r \u0003(\u000b2\u0014.google.protobuf.Any\u001ar\n\u0006Banner\u0012\u000b\n\u0003img\u0018\u0001 \u0001(\t\u0012\f\n\u0004link\u0018\u0002 \u0001(\t\u0012$\n\u0003ext\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.Any\u001aü\f\n\u0006Native\u0012D\n\u0004link\u0018\u0001 \u0001(\u000b26.bidmachine.protobuf.adcom.Ad.Display.Native.LinkAsset\u0012A\n\u0005asset\u0018\u0002 \u0003(\u000b22.bidmachine.protobuf.adcom.Ad.Display.Native.Asset\u0012$\n\u0003ext\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.Any\u001a\u0084\u0001\n\tLinkAsset\u0012\u000b\n\u0003url\u0018\u0001 \u0001(\t\u0012\r\n\u0005urlfb\u0018\u0002 \u0001(\t\u0012\f\n\u0004trkr\u0018\u0003 \u0003(\t\u0012$\n\u0003ext\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0004 \u0003(\u000b2\u0014.google.protobuf.Any\u001a\u0092\n\n\u0005Asset\u0012\n\n\u0002id\u0018\u0001 \u0001(\r\u0012\u000b\n\u0003req\u0018\u0002 \u0001(\b\u0012L\n\u0005title\u0018\u0003 \u0001(\u000b2=.bidmachine.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset\u0012L\n\u0005image\u0018\u0004 \u0001(\u000b2=.bidmachine.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset\u0012L\n\u0005video\u0018\u0005 \u0001(\u000b2=.bidmachine.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset\u0012J\n\u0004data\u0018\u0006 \u0001(\u000b2<.bidmachine.protobuf.adcom.Ad.Display.Native.Asset.DataAsset\u0012D\n\u0004link\u0018\u0007 \u0001(\u000b26.bidmachine.protobuf.adcom.Ad.Display.Native.LinkAsset\u0012L\n\u0005label\u0018\n \u0001(\u000b2=.bidmachine.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset\u0012$\n\u0003ext\u0018\t \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\b \u0003(\u000b2\u0014.google.protobuf.Any\u001av\n\nTitleAsset\u0012\f\n\u0004text\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003len\u0018\u0002 \u0001(\r\u0012$\n\u0003ext\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.Any\u001a½\u0001\n\nImageAsset\u0012\u000b\n\u0003url\u0018\u0001 \u0001(\t\u0012\t\n\u0001w\u0018\u0002 \u0001(\r\u0012\t\n\u0001h\u0018\u0003 \u0001(\r\u0012=\n\u0004type\u0018\u0004 \u0001(\u000e2/.bidmachine.protobuf.adcom.NativeImageAssetType\u0012$\n\u0003ext\u0018\u0006 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0005 \u0003(\u000b2\u0014.google.protobuf.Any\u001av\n\nVideoAsset\u0012\u000b\n\u0003adm\u0018\u0001 \u0001(\t\u0012\f\n\u0004curl\u0018\u0002 \u0001(\t\u0012$\n\u0003ext\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.Any\u001a´\u0001\n\tDataAsset\u0012\r\n\u0005value\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003len\u0018\u0002 \u0001(\r\u0012<\n\u0004type\u0018\u0003 \u0001(\u000e2..bidmachine.protobuf.adcom.NativeDataAssetType\u0012$\n\u0003ext\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0004 \u0003(\u000b2\u0014.google.protobuf.Any\u001ap\n\nLabelAsset\u0012\u000f\n\u0007content\u0018\u0001 \u0001(\t\u0012\t\n\u0001w\u0018\u0002 \u0001(\r\u0012\t\n\u0001h\u0018\u0003 \u0001(\r\u0012;\n\u0003pos\u0018\u0004 \u0001(\u000e2..bidmachine.protobuf.adcom.NativeAssetPosition\u001añ\u0001\n\u0005Video\u0012\f\n\u0004mime\u0018\u0001 \u0003(\t\u00124\n\u0003api\u0018\u0002 \u0003(\u000e2'.bidmachine.protobuf.adcom.ApiFramework\u0012:\n\u0004type\u0018\u0003 \u0003(\u000e2,.bidmachine.protobuf.adcom.VideoCreativeType\u0012\u000b\n\u0003adm\u0018\u0004 \u0001(\t\u0012\f\n\u0004curl\u0018\u0005 \u0001(\t\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any\u001að\u0001\n\u0005Audit\u0012:\n\u0006status\u0018\u0001 \u0001(\u000e2*.bidmachine.protobuf.adcom.AuditStatusCode\u0012\u0010\n\bfeedback\u0018\u0002 \u0003(\t\u0012\f\n\u0004init\u0018\u0003 \u0001(\t\u0012\u000f\n\u0007lastmod\u0018\u0004 \u0001(\t\u0012+\n\u0004corr\u0018\u0005 \u0001(\u000b2\u001d.bidmachine.protobuf.adcom.Ad\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0006 \u0003(\u000b2\u0014.google.protobuf.Any*Ö\u0001\n\u000fAuditStatusCode\u0012\u001d\n\u0019AUDIT_STATUS_CODE_INVALID\u0010\u0000\u0012#\n\u001fAUDIT_STATUS_CODE_PENDING_AUDIT\u0010\u0001\u0012\"\n\u001eAUDIT_STATUS_CODE_PRE_APPROVED\u0010\u0002\u0012\u001e\n\u001aAUDIT_STATUS_CODE_APPROVED\u0010\u0003\u0012\u001c\n\u0018AUDIT_STATUS_CODE_DENIED\u0010\u0004\u0012\u001d\n\u0019AUDIT_STATUS_CODE_CHANGED\u0010\u0005*ï\u0001\n\fApiFramework\u0012\u0019\n\u0015API_FRAMEWORK_INVALID\u0010\u0000\u0012\u001b\n\u0017API_FRAMEWORK_VPAID_1_0\u0010\u0001\u0012\u001b\n\u0017API_FRAMEWORK_VPAID_2_0\u0010\u0002\u0012\u001b\n\u0017API_FRAMEWORK_MRAID_1_0\u0010\u0003\u0012\u0017\n\u0013API_FRAMEWORK_ORMMA\u0010\u0004\u0012\u001b\n\u0017API_FRAMEWORK_MRAID_2_0\u0010\u0005\u0012\u001b\n\u0017API_FRAMEWORK_MRAID_3_0\u0010\u0006\u0012\u001a\n\u0016API_FRAMEWORK_OMID_1_0\u0010\u0007*©\u0001\n\u0010CategoryTaxonomy\u0012\u001d\n\u0019CATEGORY_TAXONOMY_INVALID\u0010\u0000\u0012%\n!CATEGORY_TAXONOMY_IAB_CONTENT_1_0\u0010\u0001\u0012%\n!CATEGORY_TAXONOMY_IAB_CONTENT_2_0\u0010\u0002\u0012(\n$CATEGORY_TAXONOMY_IAB_AD_PRODUCT_1_0\u0010\u0003*\u009f\u0001\n\tClickType\u0012\u001c\n\u0018CLICK_TYPE_NON_CLICKABLE\u0010\u0000\u0012 \n\u001cCLICK_TYPE_CLICKABLE_UNKNOWN\u0010\u0001\u0012)\n%CLICK_TYPE_CLICKABLE_EMBEDDED_BROWSER\u0010\u0002\u0012'\n#CLICK_TYPE_CLICKABLE_NATIVE_BROWSER\u0010\u0003*\u0095\u0001\n\rCompanionType\u0012\u001a\n\u0016COMPANION_TYPE_INVALID\u0010\u0000\u0012\"\n\u001eCOMPANION_TYPE_STATIC_RESOURCE\u0010\u0001\u0012 \n\u001cCOMPANION_TYPE_HTML_RESOURCE\u0010\u0002\u0012\"\n\u001eCOMPANION_TYPE_IFRAME_RESOURCE\u0010\u0003*·\u0002\n\u000eConnectionType\u0012\u001b\n\u0017CONNECTION_TYPE_INVALID\u0010\u0000\u0012\u001c\n\u0018CONNECTION_TYPE_ETHERNET\u0010\u0001\u0012\u0018\n\u0014CONNECTION_TYPE_WIFI\u0010\u0002\u0012,\n(CONNECTION_TYPE_CELLULAR_NETWORK_UNKNOWN\u0010\u0003\u0012'\n#CONNECTION_TYPE_CELLULAR_NETWORK_2G\u0010\u0004\u0012'\n#CONNECTION_TYPE_CELLULAR_NETWORK_3G\u0010\u0005\u0012'\n#CONNECTION_TYPE_CELLULAR_NETWORK_4G\u0010\u0006\u0012'\n#CONNECTION_TYPE_CELLULAR_NETWORK_5G\u0010\u0007*ð\u0001\n\u000eContentContext\u0012\u001b\n\u0017CONTENT_CONTEXT_INVALID\u0010\u0000\u0012\u0019\n\u0015CONTENT_CONTEXT_VIDEO\u0010\u0001\u0012\u0018\n\u0014CONTENT_CONTEXT_GAME\u0010\u0002\u0012\u0019\n\u0015CONTENT_CONTEXT_MUSIC\u0010\u0003\u0012\u001f\n\u001bCONTENT_CONTEXT_APPLICATION\u0010\u0004\u0012\u0018\n\u0014CONTENT_CONTEXT_TEXT\u0010\u0005\u0012\u0019\n\u0015CONTENT_CONTEXT_OTHER\u0010\u0006\u0012\u001b\n\u0017CONTENT_CONTEXT_UNKNOWN\u0010\u0007*Î\u0006\n\u0011CreativeAttribute\u0012\u001e\n\u001aCREATIVE_ATTRIBUTE_INVALID\u0010\u0000\u0012(\n$CREATIVE_ATTRIBUTE_AUDIO_AD_AUTOPLAY\u0010\u0001\u0012.\n*CREATIVE_ATTRIBUTE_AUDIO_AD_USER_INITIATED\u0010\u0002\u0012+\n'CREATIVE_ATTRIBUTE_EXPANDABLE_AUTOMATIC\u0010\u0003\u00126\n2CREATIVE_ATTRIBUTE_EXPANDABLE_USER_INITIATED_CLICK\u0010\u0004\u00129\n5CREATIVE_ATTRIBUTE_EXPANDABLE_USER_INITIATED_ROLLOVER\u0010\u0005\u00122\n.CREATIVE_ATTRIBUTE_IN_BANNER_VIDEO_AD_AUTOPLAY\u0010\u0006\u00128\n4CREATIVE_ATTRIBUTE_IN_BANNER_VIDEO_AD_USER_INITIATED\u0010\u0007\u0012\u001a\n\u0016CREATIVE_ATTRIBUTE_POP\u0010\b\u00125\n1CREATIVE_ATTRIBUTE_PROVOCATIVE_SUGGESTIVE_IMAGERY\u0010\t\u0012(\n$CREATIVE_ATTRIBUTE_EXTREME_ANIMATION\u0010\n\u0012\u001e\n\u001aCREATIVE_ATTRIBUTE_SURVEYS\u0010\u000b\u0012 \n\u001cCREATIVE_ATTRIBUTE_TEXT_ONLY\u0010\f\u0012'\n#CREATIVE_ATTRIBUTE_USER_INTERACTIVE\u0010\r\u0012\"\n\u001eCREATIVE_ATTRIBUTE_ALERT_STYLE\u0010\u000e\u0012.\n*CREATIVE_ATTRIBUTE_HAS_AUDIO_ON_OFF_BUTTON\u0010\u000f\u0012.\n*CREATIVE_ATTRIBUTE_AD_PROVIDES_SKIP_BUTTON\u0010\u0010\u0012\"\n\u001eCREATIVE_ATTRIBUTE_ADOBE_FLASH\u0010\u0011\u0012!\n\u001dCREATIVE_ATTRIBUTE_RESPONSIVE\u0010\u0012*\u008b\u0001\n\u000eDeliveryMethod\u0012\u001b\n\u0017DELIVERY_METHOD_INVALID\u0010\u0000\u0012\u001d\n\u0019DELIVERY_METHOD_STREAMING\u0010\u0001\u0012\u001f\n\u001bDELIVERY_METHOD_PROGRESSIVE\u0010\u0002\u0012\u001c\n\u0018DELIVERY_METHOD_DOWNLOAD\u0010\u0003*s\n\nDeviceType\u0012\u0017\n\u0013DEVICE_TYPE_INVALID\u0010\u0000\u0012\u0016\n\u0012DEVICE_TYPE_MOBILE\u0010\u0001\u0012\u001c\n\u0018DEVICE_TYPE_PHONE_DEVICE\u0010\u0004\u0012\u0016\n\u0012DEVICE_TYPE_TABLET\u0010\u0005*³\u0004\n\u0012DisplayContextType\u0012 \n\u001cDISPLAY_CONTEXT_TYPE_INVALID\u0010\u0000\u00120\n,DISPLAY_CONTEXT_TYPE_CONTENT_CENTRIC_CONTEXT\u0010\n\u0012(\n$DISPLAY_CONTEXT_TYPE_ARTICLE_CONTENT\u0010\u000b\u0012&\n\"DISPLAY_CONTEXT_TYPE_VIDEO_CONTENT\u0010\f\u0012&\n\"DISPLAY_CONTEXT_TYPE_AUDIO_CONTENT\u0010\r\u0012&\n\"DISPLAY_CONTEXT_TYPE_IMAGE_CONTENT\u0010\u000e\u0012/\n+DISPLAY_CONTEXT_TYPE_USER_GENERATED_CONTENT\u0010\u000f\u0012/\n+DISPLAY_CONTEXT_TYPE_SOCIAL_CENTRIC_CONTEXT\u0010\u0014\u0012&\n\"DISPLAY_CONTEXT_TYPE_EMAIL_CONTENT\u0010\u0015\u0012%\n!DISPLAY_CONTEXT_TYPE_CHAT_CONTENT\u0010\u0016\u0012(\n$DISPLAY_CONTEXT_TYPE_PRODUCT_CONTEXT\u0010\u001e\u0012\"\n\u001eDISPLAY_CONTEXT_TYPE_APP_STORE\u0010\u001f\u0012(\n$DISPLAY_CONTEXT_TYPE_PRODUCT_REVIEWS\u0010 *Ì\u0001\n\u0013DisplayCreativeType\u0012!\n\u001dDISPLAY_CREATIVE_TYPE_INVALID\u0010\u0000\u0012\u001e\n\u001aDISPLAY_CREATIVE_TYPE_HTML\u0010\u0001\u0012!\n\u001dDISPLAY_CRE", "ATIVE_TYPE_AMPHTML\u0010\u0002\u0012&\n\"DISPLAY_CREATIVE_TYPE_IMAGE_OBJECT\u0010\u0003\u0012'\n#DISPLAY_CREATIVE_TYPE_NATIVE_OBJECT\u0010\u0004*ô\u0001\n\u0014DisplayPlacementType\u0012\"\n\u001eDISPLAY_PLACEMENT_TYPE_INVALID\u0010\u0000\u0012*\n&DISPLAY_PLACEMENT_TYPE_IN_FEED_DISPLAY\u0010\u0001\u0012)\n%DISPLAY_PLACEMENT_TYPE_IN_ATOMIC_UNIT\u0010\u0002\u0012/\n+DISPLAY_PLACEMENT_TYPE_OUTSIDE_CORE_CONTENT\u0010\u0003\u00120\n,DISPLAY_PLACEMENT_TYPE_RECOMMENDATION_WIDGET\u0010\u0004*Ø\u0001\n\u0013ExpandableDirection\u0012 \n\u001cEXPANDABLE_DIRECTION_INVALID\u0010\u0000\u0012\u001d\n\u0019EXPANDABLE_DIRECTION_LEFT\u0010\u0001\u0012\u001e\n\u001aEXPANDABLE_DIRECTION_RIGHT\u0010\u0002\u0012\u001b\n\u0017EXPANDABLE_DIRECTION_UP\u0010\u0003\u0012\u001d\n\u0019EXPANDABLE_DIRECTION_DOWN\u0010\u0004\u0012$\n EXPANDABLE_DIRECTION_FULL_SCREEN\u0010\u0005*\u0085\u0001\n\u0013EventTrackingMethod\u0012!\n\u001dEVENT_TRACKING_METHOD_INVALID\u0010\u0000\u0012%\n!EVENT_TRACKING_METHOD_IMAGE_PIXEL\u0010\u0001\u0012$\n EVENT_TRACKING_METHOD_JAVASCRIPT\u0010\u0002*¡\u0001\n\tEventType\u0012\u0016\n\u0012EVENT_TYPE_INVALID\u0010\u0000\u0012\u0019\n\u0015EVENT_TYPE_IMPRESSION\u0010\u0001\u0012\u001e\n\u001aEVENT_TYPE_VIEWABLE_MRC_50\u0010\u0002\u0012\u001f\n\u001bEVENT_TYPE_VIEWABLE_MRC_100\u0010\u0003\u0012 \n\u001cEVENT_TYPE_VIEWABLE_VIDEO_50\u0010\u0004*¾\u0001\n\u0011IpLocationService\u0012\u001f\n\u001bIP_LOCATION_SERVICE_INVALID\u0010\u0000\u0012#\n\u001fIP_LOCATION_SERVICE_IP2LOCATION\u0010\u0001\u0012\u001f\n\u001bIP_LOCATION_SERVICE_NEUSTAR\u0010\u0002\u0012\u001f\n\u001bIP_LOCATION_SERVICE_MAXMIND\u0010\u0003\u0012!\n\u001dIP_LOCATION_SERVICE_NETAQUITY\u0010\u0004*e\n\rLinearityMode\u0012\u001a\n\u0016LINEARITY_MODE_INVALID\u0010\u0000\u0012\u0019\n\u0015LINEARITY_MODE_LINEAR\u0010\u0001\u0012\u001d\n\u0019LINEARITY_MODE_NON_LINEAR\u0010\u0002*n\n\fLocationType\u0012\u0019\n\u0015LOCATION_TYPE_INVALID\u0010\u0000\u0012\u0015\n\u0011LOCATION_TYPE_GPS\u0010\u0001\u0012\u0014\n\u0010LOCATION_TYPE_IP\u0010\u0002\u0012\u0016\n\u0012LOCATION_TYPE_USER\u0010\u0003*\u0091\u0001\n\u000bMediaRating\u0012\u0018\n\u0014MEDIA_RATING_INVALID\u0010\u0000\u0012\u001e\n\u001aMEDIA_RATING_ALL_AUDIENCES\u0010\u0001\u0012%\n!MEDIA_RATING_EVERYONE_OVER_AGE_12\u0010\u0002\u0012!\n\u001dMEDIA_RATING_MATURE_AUDIENCES\u0010\u0003*\u0093\u0004\n\u0013NativeDataAssetType\u0012\"\n\u001eNATIVE_DATA_ASSET_TYPE_INVALID\u0010\u0000\u0012$\n NATIVE_DATA_ASSET_TYPE_SPONSORED\u0010\u0001\u0012\u001f\n\u001bNATIVE_DATA_ASSET_TYPE_DESC\u0010\u0002\u0012!\n\u001dNATIVE_DATA_ASSET_TYPE_RATING\u0010\u0003\u0012 \n\u001cNATIVE_DATA_ASSET_TYPE_LIKES\u0010\u0004\u0012$\n NATIVE_DATA_ASSET_TYPE_DOWNLOADS\u0010\u0005\u0012 \n\u001cNATIVE_DATA_ASSET_TYPE_PRICE\u0010\u0006\u0012%\n!NATIVE_DATA_ASSET_TYPE_SALE_PRICE\u0010\u0007\u0012 \n\u001cNATIVE_DATA_ASSET_TYPE_PHONE\u0010\b\u0012\"\n\u001eNATIVE_DATA_ASSET_TYPE_ADDRESS\u0010\t\u0012 \n\u001cNATIVE_DATA_ASSET_TYPE_DESC2\u0010\n\u0012&\n\"NATIVE_DATA_ASSET_TYPE_DISPLAY_URL\u0010\u000b\u0012#\n\u001fNATIVE_DATA_ASSET_TYPE_CTA_TEXT\u0010\f\u0012(\n$NATIVE_DATA_ASSET_TYPE_PRIVACY_SHEET\u0010\r*\u008b\u0001\n\u0014NativeImageAssetType\u0012#\n\u001fNATIVE_IMAGE_ASSET_TYPE_INVALID\u0010\u0000\u0012&\n\"NATIVE_IMAGE_ASSET_TYPE_ICON_IMAGE\u0010\u0001\u0012&\n\"NATIVE_IMAGE_ASSET_TYPE_MAIN_IMAGE\u0010\u0003*\u0091\u0001\n\u0013NativeAssetPosition\u0012\u001b\n\u0017ASSET_POSITION_TOP_LEFT\u0010\u0000\u0012\u001c\n\u0018ASSET_POSITION_TOP_RIGHT\u0010\u0001\u0012\u001e\n\u001aASSET_POSITION_BOTTOM_LEFT\u0010\u0002\u0012\u001f\n\u001bASSET_POSITION_BOTTOM_RIGHT\u0010\u0003*0\n\u0002OS\u0012\u000e\n\nOS_INVALID\u0010\u0000\u0012\u000e\n\nOS_ANDROID\u0010\u0002\u0012\n\n\u0006OS_IOS\u0010\r*â\u0001\n\u0015PlaybackCessationMode\u0012#\n\u001fPLAYBACK_CESSATION_MODE_INVALID\u0010\u0000\u0012/\n+PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION\u0010\u0001\u0012/\n+PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT\u0010\u0002\u0012B\n>PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING\u0010\u0003*¾\u0002\n\u000ePlaybackMethod\u0012\u001b\n\u0017PLAYBACK_METHOD_INVALID\u0010\u0000\u0012)\n%PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_ON\u0010\u0001\u0012*\n&PLAYBACK_METHOD_ON_PAGE_LOAD_SOUND_OFF\u0010\u0002\u0012%\n!PLAYBACK_METHOD_ON_CLICK_SOUND_ON\u0010\u0003\u0012*\n&PLAYBACK_METHOD_ON_MOUSE_OVER_SOUND_ON\u0010\u0004\u00121\n-PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_ON\u0010\u0005\u00122\n.PLAYBACK_METHOD_ON_ENTERING_VIEWPORT_SOUND_OFF\u0010\u0006*¡\u0002\n\u0011PlacementPosition\u0012\u001e\n\u001aPLACEMENT_POSITION_INVALID\u0010\u0000\u0012%\n!PLACEMENT_POSITION_ABOVE_THE_FOLD\u0010\u0001\u0012\u001d\n\u0019PLACEMENT_POSITION_LOCKED\u0010\u0002\u0012%\n!PLACEMENT_POSITION_BELOW_THE_FOLD\u0010\u0003\u0012\u001d\n\u0019PLACEMENT_POSITION_HEADER\u0010\u0004\u0012\u001d\n\u0019PLACEMENT_POSITION_FOOTER\u0010\u0005\u0012\u001e\n\u001aPLACEMENT_POSITION_SIDEBAR\u0010\u0006\u0012!\n\u001dPLACEMENT_POSITION_FULLSCREEN\u0010\u0007*«\u0001\n\u0011ProductionQuality\u0012\u001e\n\u001aPRODUCTION_QUALITY_INVALID\u0010\u0000\u0012.\n*PRODUCTION_QUALITY_PROFESSIONALLY_PRODUCED\u0010\u0001\u0012\u001f\n\u001bPRODUCTION_QUALITY_PROSUMER\u0010\u0002\u0012%\n!PRODUCTION_QUALITY_USER_GENERATED\u0010\u0003*f\n\bSizeUnit\u0012\u0015\n\u0011SIZE_UNIT_INVALID\u0010\u0000\u0012\u0012\n\u000eSIZE_UNIT_DIPS\u0010\u0001\u0012\u0014\n\u0010SIZE_UNIT_INCHES\u0010\u0002\u0012\u0019\n\u0015SIZE_UNIT_CENTIMETERS\u0010\u0003*°\u0003\n\u0011VideoCreativeType\u0012\u001f\n\u001bVIDEO_CREATIVE_TYPE_INVALID\u0010\u0000\u0012 \n\u001cVIDEO_CREATIVE_TYPE_VAST_1_0\u0010\u0001\u0012 \n\u001cVIDEO_CREATIVE_TYPE_VAST_2_0\u0010\u0002\u0012 \n\u001cVIDEO_CREATIVE_TYPE_VAST_3_0\u0010\u0003\u0012(\n$VIDEO_CREATIVE_TYPE_VAST_WRAPPER_1_0\u0010\u0004\u0012(\n$VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0\u0010\u0005\u0012(\n$VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0\u0010\u0006\u0012 \n\u001cVIDEO_CREATIVE_TYPE_VAST_4_0\u0010\u0007\u0012(\n$VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_0\u0010\b\u0012 \n\u001cVIDEO_CREATIVE_TYPE_VAST_4_1\u0010\t\u0012(\n$VIDEO_CREATIVE_TYPE_VAST_WRAPPER_4_1\u0010\n*ì\u0001\n\u0012VideoPlacementType\u0012 \n\u001cVIDEO_PLACEMENT_TYPE_INVALID\u0010\u0000\u0012\"\n\u001eVIDEO_PLACEMENT_TYPE_IN_STREAM\u0010\u0001\u0012\"\n\u001eVIDEO_PLACEMENT_TYPE_IN_BANNER\u0010\u0002\u0012#\n\u001fVIDEO_PLACEMENT_TYPE_IN_ARTICLE\u0010\u0003\u0012 \n\u001cVIDEO_PLACEMENT_TYPE_IN_FEED\u0010\u0004\u0012%\n!VIDEO_PLACEMENT_TYPE_INTERSTITIAL\u0010\u0005*r\n\u0010ConnectionStatus\u0012\u001f\n\u001bCONNECTION_STATUS_UNDEFINED\u0010\u0000\u0012\u001d\n\u0019CONNECTION_STATUS_ENABLED\u0010\u0001\u0012\u001e\n\u001aCONNECTION_STATUS_DISABLED\u0010\u0002B7\n\u001fcom.explorestack.protobuf.adcomB\nAdcomProtoP\u0001¢\u0002\u0005ADCOMb\u0006proto3"}, new Descriptors.FileDescriptor[]{f.a(), f2.a()});
    static final h0.f F;
    static final Descriptors.Descriptor G;
    static final h0.f H;
    static final Descriptors.Descriptor I;
    static final h0.f J;
    static final Descriptors.Descriptor K;
    static final h0.f L;
    static final Descriptors.Descriptor M;
    static final h0.f N;
    static final Descriptors.Descriptor O;
    static final h0.f P;
    static final Descriptors.Descriptor Q;
    static final h0.f R;
    static final Descriptors.Descriptor S;
    static final h0.f T;
    static final Descriptors.Descriptor U;
    static final h0.f V;
    static final Descriptors.Descriptor W;
    static final h0.f X;
    static final Descriptors.Descriptor Y;
    static final h0.f Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Descriptors.Descriptor f18803a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final Descriptors.Descriptor f18804a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final h0.f f18805b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final h0.f f18806b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Descriptors.Descriptor f18807c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    static final Descriptors.Descriptor f18808c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final h0.f f18809d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    static final h0.f f18810d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Descriptors.Descriptor f18811e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    static final Descriptors.Descriptor f18812e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final h0.f f18813f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    static final h0.f f18814f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Descriptors.Descriptor f18815g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    static final Descriptors.Descriptor f18816g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final h0.f f18817h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    static final h0.f f18818h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Descriptors.Descriptor f18819i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    static final Descriptors.Descriptor f18820i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final h0.f f18821j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    static final h0.f f18822j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Descriptors.Descriptor f18823k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    static final Descriptors.Descriptor f18824k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final h0.f f18825l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    static final h0.f f18826l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final Descriptors.Descriptor f18827m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    static final Descriptors.Descriptor f18828m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final h0.f f18829n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    static final h0.f f18830n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final Descriptors.Descriptor f18831o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final Descriptors.Descriptor f18832o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final h0.f f18833p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final h0.f f18834p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final Descriptors.Descriptor f18835q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    static final Descriptors.Descriptor f18836q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final h0.f f18837r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    static final h0.f f18838r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final Descriptors.Descriptor f18839s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    static final Descriptors.Descriptor f18840s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final h0.f f18841t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    static final h0.f f18842t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final Descriptors.Descriptor f18843u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    static final Descriptors.Descriptor f18844u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final h0.f f18845v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    static final h0.f f18846v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final Descriptors.Descriptor f18847w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    static final Descriptors.Descriptor f18848w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final h0.f f18849x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    static final h0.f f18850x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final Descriptors.Descriptor f18851y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    static final Descriptors.Descriptor f18852y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final h0.f f18853z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    static final h0.f f18854z0;

    static {
        Descriptors.Descriptor descriptor = a().getMessageTypes().get(0);
        f18803a = descriptor;
        f18805b = new h0.f(descriptor, new String[]{"App", "Device", "Regs", "Restrictions", "User", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f18807c = descriptor2;
        f18809d = new h0.f(descriptor2, new String[]{"Id", "Name", "Pub", "Content", "Domain", "Cat", "Sectcat", "Pagecat", "Cattax", "Privpolicy", "Keywords", "Bundle", "Storeid", "Storeurl", "Ver", "Paid", "Release", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        f18811e = descriptor3;
        f18813f = new h0.f(descriptor3, new String[]{"Id", "Name", "Domain", "Cat", "Cattax", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        f18815g = descriptor4;
        f18817h = new h0.f(descriptor4, new String[]{"Id", "Episode", "Title", "Series", "Season", ExifInterface.TAG_ARTIST, "Genre", "Album", "Isrc", "Url", "Cat", "Cattax", "Prodq", "Context", "Rating", "Urating", "Mrating", "Keywords", "Live", "Srcrel", "Len", "Lang", "Embed", "Producer", "Data", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        f18819i = descriptor5;
        f18821j = new h0.f(descriptor5, new String[]{"Id", "Name", "Domain", "Cat", "Cattax", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor6 = descriptor2.getNestedTypes().get(2);
        f18823k = descriptor6;
        f18825l = new h0.f(descriptor6, new String[]{"Type", "SignatureSHA1", "SignatureSHA256"});
        Descriptors.Descriptor descriptor7 = descriptor.getNestedTypes().get(1);
        f18827m = descriptor7;
        f18829n = new h0.f(descriptor7, new String[]{"Id", "Name", "Segment", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        f18831o = descriptor8;
        f18833p = new h0.f(descriptor8, new String[]{"Id", "Name", "Value", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor9 = descriptor.getNestedTypes().get(2);
        f18835q = descriptor9;
        f18837r = new h0.f(descriptor9, new String[]{"Type", "Lat", "Lon", "Accur", "Lastfix", "Ipserv", "Country", "Region", "Metro", "City", "Zip", "Utcoffset", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor10 = descriptor.getNestedTypes().get(3);
        f18839s = descriptor10;
        f18841t = new h0.f(descriptor10, new String[]{"Type", "Ua", "Ifa", "Dnt", "Lmt", ExifInterface.TAG_MAKE, ExifInterface.TAG_MODEL, "Os", "Osv", "Hwv", "H", ExifInterface.LONGITUDE_WEST, "Ppi", "Pxratio", "Js", "Lang", "Ip", "Ipv6", "Xff", "Iptr", "Carrier", "Mccmnc", "Mccmncsim", "Contype", "Geofetch", "Geo", "Connection", "AudioContext", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor11 = descriptor10.getNestedTypes().get(0);
        f18843u = descriptor11;
        f18845v = new h0.f(descriptor11, new String[]{"Type", "Proxy", "Vpn"});
        Descriptors.Descriptor descriptor12 = descriptor10.getNestedTypes().get(1);
        f18847w = descriptor12;
        f18849x = new h0.f(descriptor12, new String[]{"IsAudioPlaying", "Volumelevel"});
        Descriptors.Descriptor descriptor13 = descriptor.getNestedTypes().get(4);
        f18851y = descriptor13;
        f18853z = new h0.f(descriptor13, new String[]{"Coppa", "Gdpr", "Gpp", "GppSid", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor14 = descriptor.getNestedTypes().get(5);
        A = descriptor14;
        B = new h0.f(descriptor14, new String[]{"Bcat", "Cattax", "Badv", "Bapp", "Battr", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor15 = descriptor.getNestedTypes().get(6);
        C = descriptor15;
        D = new h0.f(descriptor15, new String[]{"Id", "Buyeruid", "Yob", "Gender", "Keywords", "Consent", "Geo", "Data", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor16 = a().getMessageTypes().get(1);
        E = descriptor16;
        F = new h0.f(descriptor16, new String[]{"Tagid", "Ssai", "Sdk", "Sdkver", "Reward", "Bcat", "Cattax", "Badv", "Bapp", "Battr", "Wlang", "Secure", "Admx", "Curlx", "Display", "Video", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor17 = descriptor16.getNestedTypes().get(0);
        G = descriptor17;
        H = new h0.f(descriptor17, new String[]{"Pos", "Instl", "Topframe", "Ifrbust", "Clktype", "Ampren", "Ptype", "Context", "Mime", "Api", "Ctype", ExifInterface.LONGITUDE_WEST, "H", "Unit", "Priv", "Displayfmt", "Nativefmt", "Event", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor18 = descriptor17.getNestedTypes().get(0);
        I = descriptor18;
        J = new h0.f(descriptor18, new String[]{ExifInterface.LONGITUDE_WEST, "H", "Wratio", "Hratio", "Expdir", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor19 = descriptor17.getNestedTypes().get(1);
        K = descriptor19;
        L = new h0.f(descriptor19, new String[]{"Asset", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor20 = descriptor19.getNestedTypes().get(0);
        M = descriptor20;
        N = new h0.f(descriptor20, new String[]{"Id", "Req", "Title", "Img", "Video", "Data", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor21 = descriptor20.getNestedTypes().get(0);
        O = descriptor21;
        P = new h0.f(descriptor21, new String[]{"Len", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor22 = descriptor20.getNestedTypes().get(1);
        Q = descriptor22;
        R = new h0.f(descriptor22, new String[]{"Type", "Mime", ExifInterface.LONGITUDE_WEST, "H", "Wmin", "Hmin", "Wratio", "Hratio", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor23 = descriptor20.getNestedTypes().get(2);
        S = descriptor23;
        T = new h0.f(descriptor23, new String[]{"Type", "Len", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor24 = descriptor17.getNestedTypes().get(2);
        U = descriptor24;
        V = new h0.f(descriptor24, new String[]{"Type", "Method", "Api", "Jstrk", "Wjs", "Pxtrk", "Wpx", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor25 = descriptor16.getNestedTypes().get(1);
        W = descriptor25;
        X = new h0.f(descriptor25, new String[]{"Ptype", "Pos", "Delay", "Skip", "Skipmin", "Skipafter", "Playmethod", "Playend", "Clktype", "Mime", "Api", "Ctype", ExifInterface.LONGITUDE_WEST, "H", "Unit", "Mindur", "Maxdur", "Maxext", "Minbitr", "Maxbitr", "Delivery", "Maxseq", y.f66052c, "Boxing", "Comp", "Comptype", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor26 = descriptor25.getNestedTypes().get(0);
        Y = descriptor26;
        Z = new h0.f(descriptor26, new String[]{"Id", "Vcm", "Display", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor27 = a().getMessageTypes().get(2);
        f18804a0 = descriptor27;
        f18806b0 = new h0.f(descriptor27, new String[]{"Id", "Adomain", "Bundle", "Iurl", "Cat", "Cattax", "Lang", "Secure", "Mrating", "Init", "Lastmod", "Display", "Video", "Audit", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor28 = descriptor27.getNestedTypes().get(0);
        f18808c0 = descriptor28;
        f18810d0 = new h0.f(descriptor28, new String[]{"Type", "Method", "Api", "Url", "Cdata", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor29 = descriptor28.getNestedTypes().get(0);
        f18812e0 = descriptor29;
        f18814f0 = new h0.f(descriptor29, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor30 = descriptor27.getNestedTypes().get(1);
        f18816g0 = descriptor30;
        f18818h0 = new h0.f(descriptor30, new String[]{"Mime", "Api", "Type", ExifInterface.LONGITUDE_WEST, "H", "Wratio", "Hratio", "Adm", "Curl", "Banner", LogConstants.KEY_NATIVE, "Event", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor31 = descriptor30.getNestedTypes().get(0);
        f18820i0 = descriptor31;
        f18822j0 = new h0.f(descriptor31, new String[]{"Img", HttpHeaders.LINK, "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor32 = descriptor30.getNestedTypes().get(1);
        f18824k0 = descriptor32;
        f18826l0 = new h0.f(descriptor32, new String[]{HttpHeaders.LINK, "Asset", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor33 = descriptor32.getNestedTypes().get(0);
        f18828m0 = descriptor33;
        f18830n0 = new h0.f(descriptor33, new String[]{"Url", "Urlfb", "Trkr", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor34 = descriptor32.getNestedTypes().get(1);
        f18832o0 = descriptor34;
        f18834p0 = new h0.f(descriptor34, new String[]{"Id", "Req", "Title", "Image", "Video", "Data", HttpHeaders.LINK, TextFieldImplKt.LabelId, "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor35 = descriptor34.getNestedTypes().get(0);
        f18836q0 = descriptor35;
        f18838r0 = new h0.f(descriptor35, new String[]{"Text", "Len", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor36 = descriptor34.getNestedTypes().get(1);
        f18840s0 = descriptor36;
        f18842t0 = new h0.f(descriptor36, new String[]{"Url", ExifInterface.LONGITUDE_WEST, "H", "Type", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor37 = descriptor34.getNestedTypes().get(2);
        f18844u0 = descriptor37;
        f18846v0 = new h0.f(descriptor37, new String[]{"Adm", "Curl", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor38 = descriptor34.getNestedTypes().get(3);
        f18848w0 = descriptor38;
        f18850x0 = new h0.f(descriptor38, new String[]{"Value", "Len", "Type", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor39 = descriptor34.getNestedTypes().get(4);
        f18852y0 = descriptor39;
        f18854z0 = new h0.f(descriptor39, new String[]{"Content", ExifInterface.LONGITUDE_WEST, "H", "Pos"});
        Descriptors.Descriptor descriptor40 = descriptor27.getNestedTypes().get(2);
        A0 = descriptor40;
        B0 = new h0.f(descriptor40, new String[]{"Mime", "Api", "Type", "Adm", "Curl", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor41 = descriptor27.getNestedTypes().get(3);
        C0 = descriptor41;
        D0 = new h0.f(descriptor41, new String[]{"Status", "Feedback", "Init", "Lastmod", "Corr", "Ext", "ExtProto"});
        f.a();
        f2.a();
    }

    public static Descriptors.FileDescriptor a() {
        return E0;
    }
}
