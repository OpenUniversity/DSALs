package cool;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.java_front.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class transform  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm const126;

  protected static IStrategoTerm const125;

  protected static IStrategoTerm const124;

  protected static IStrategoTerm const123;

  protected static IStrategoTerm const122;

  protected static IStrategoTerm constTypeName6;

  protected static IStrategoTerm constId33;

  protected static IStrategoTerm const121;

  protected static IStrategoTerm constId32;

  protected static IStrategoTerm const120;

  protected static IStrategoTerm constCons42;

  protected static IStrategoTerm constTry0;

  protected static IStrategoTerm constCons41;

  protected static IStrategoTerm constCatch0;

  protected static IStrategoTerm constBlock2;

  protected static IStrategoTerm constCons40;

  protected static IStrategoTerm constThrow0;

  protected static IStrategoTerm constNewInstance1;

  protected static IStrategoTerm constClassOrInterfaceType3;

  protected static IStrategoTerm constTypeName5;

  protected static IStrategoTerm constId31;

  protected static IStrategoTerm const119;

  protected static IStrategoTerm constParam1;

  protected static IStrategoTerm constId30;

  protected static IStrategoTerm const118;

  protected static IStrategoTerm constClassOrInterfaceType2;

  protected static IStrategoTerm constTypeName4;

  protected static IStrategoTerm constId29;

  protected static IStrategoTerm const117;

  protected static IStrategoTerm constBlock1;

  protected static IStrategoTerm constCons39;

  protected static IStrategoTerm constExprStm1;

  protected static IStrategoTerm constInvoke5;

  protected static IStrategoTerm constMethod6;

  protected static IStrategoTerm constMethodName6;

  protected static IStrategoTerm constId28;

  protected static IStrategoTerm const116;

  protected static IStrategoTerm const115;

  protected static IStrategoTerm constMethod5;

  protected static IStrategoTerm constMethodName5;

  protected static IStrategoTerm const114;

  protected static IStrategoTerm const113;

  protected static IStrategoTerm const112;

  protected static IStrategoTerm const111;

  protected static IStrategoTerm constCons38;

  protected static IStrategoTerm constExprStm0;

  protected static IStrategoTerm constInvoke4;

  protected static IStrategoTerm constMethod4;

  protected static IStrategoTerm constMethodName4;

  protected static IStrategoTerm constId27;

  protected static IStrategoTerm const110;

  protected static IStrategoTerm constId26;

  protected static IStrategoTerm const109;

  protected static IStrategoTerm constAmbName3;

  protected static IStrategoTerm constId25;

  protected static IStrategoTerm const108;

  protected static IStrategoTerm constTypeName3;

  protected static IStrategoTerm constId24;

  protected static IStrategoTerm const107;

  protected static IStrategoTerm constPackageOrTypeName5;

  protected static IStrategoTerm constId23;

  protected static IStrategoTerm const106;

  protected static IStrategoTerm constPackageOrTypeName4;

  protected static IStrategoTerm constId22;

  protected static IStrategoTerm const105;

  protected static IStrategoTerm constPackageOrTypeName3;

  protected static IStrategoTerm constId21;

  protected static IStrategoTerm const104;

  protected static IStrategoTerm constPackageOrTypeName2;

  protected static IStrategoTerm constId20;

  protected static IStrategoTerm const103;

  protected static IStrategoTerm constCons37;

  protected static IStrategoTerm constCons36;

  protected static IStrategoTerm constSynchronized0;

  protected static IStrategoTerm const102;

  protected static IStrategoTerm constCons35;

  protected static IStrategoTerm const101;

  protected static IStrategoTerm const100;

  protected static IStrategoTerm const99;

  protected static IStrategoTerm const98;

  protected static IStrategoTerm constCons34;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons33;

  protected static IStrategoTerm constId19;

  protected static IStrategoTerm constCons32;

  protected static IStrategoTerm constId18;

  protected static IStrategoTerm const97;

  protected static IStrategoTerm constVoid0;

  protected static IStrategoTerm constId17;

  protected static IStrategoTerm const96;

  protected static IStrategoTerm constId16;

  protected static IStrategoTerm const95;

  protected static IStrategoTerm constId15;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm constId14;

  protected static IStrategoTerm const93;

  protected static IStrategoTerm constId13;

  protected static IStrategoTerm const92;

  protected static IStrategoTerm constCons31;

  protected static IStrategoTerm constCons30;

  protected static IStrategoTerm constFormalWildcard0;

  protected static IStrategoTerm constModPattern0;

  protected static IStrategoTerm constAnnoPattern0;

  protected static IStrategoTerm constCons29;

  protected static IStrategoTerm constMarkerAnno0;

  protected static IStrategoTerm constTypeName2;

  protected static IStrategoTerm constId12;

  protected static IStrategoTerm const91;

  protected static IStrategoTerm constPackageOrTypeName1;

  protected static IStrategoTerm constId11;

  protected static IStrategoTerm const90;

  protected static IStrategoTerm constPackageOrTypeName0;

  protected static IStrategoTerm constId10;

  protected static IStrategoTerm const89;

  protected static IStrategoTerm constCons28;

  protected static IStrategoTerm constPublic0;

  protected static IStrategoTerm constCons27;

  protected static IStrategoTerm constPrivileged0;

  protected static IStrategoTerm const88;

  protected static IStrategoTerm constFalse0;

  protected static IStrategoTerm const87;

  protected static IStrategoTerm const86;

  protected static IStrategoTerm const85;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm constCons26;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm constInvoke3;

  protected static IStrategoTerm constCons25;

  protected static IStrategoTerm constNewInstance0;

  protected static IStrategoTerm constClassOrInterfaceType1;

  protected static IStrategoTerm constTypeName1;

  protected static IStrategoTerm constId9;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm constMethod3;

  protected static IStrategoTerm constMethodName3;

  protected static IStrategoTerm constId8;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm constAmbName2;

  protected static IStrategoTerm constId7;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm constClassOrInterfaceType0;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm constMethodDec0;

  protected static IStrategoTerm constBlock0;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm constReturn0;

  protected static IStrategoTerm constSome0;

  protected static IStrategoTerm constLazyAnd0;

  protected static IStrategoTerm constNot1;

  protected static IStrategoTerm constInvoke2;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm constInvoke1;

  protected static IStrategoTerm constMethod2;

  protected static IStrategoTerm constMethodName2;

  protected static IStrategoTerm constId6;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm constAmbName1;

  protected static IStrategoTerm constId5;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm constMethod1;

  protected static IStrategoTerm constMethodName1;

  protected static IStrategoTerm constId4;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm constNot0;

  protected static IStrategoTerm constInvoke0;

  protected static IStrategoTerm constMethod0;

  protected static IStrategoTerm constMethodName0;

  protected static IStrategoTerm constId3;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm constAmbName0;

  protected static IStrategoTerm constMethodDecHead0;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm constParam0;

  protected static IStrategoTerm constId2;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm constTypeName0;

  protected static IStrategoTerm constId1;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm constId0;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm constBoolean0;

  protected static IStrategoTerm constNone0;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm constPrivate0;

  protected static IStrategoTerm constCons19;

  protected static IStrategoTerm constStatic0;

  public static IStrategoTerm getCoolTbl()
  { 
    return constCoolTbl;
  }

  protected static ImportTerm constCoolTbl;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm constCons18;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constFBOX47;

  protected static IStrategoTerm constS64;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm constFBOX46;

  protected static IStrategoTerm constS63;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm constFBOX45;

  protected static IStrategoTerm constS62;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm constFBOX44;

  protected static IStrategoTerm constS61;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm constFBOX43;

  protected static IStrategoTerm constS60;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm constCons17;

  protected static IStrategoTerm constSOpt4;

  protected static IStrategoTerm constCons16;

  protected static IStrategoTerm constCons15;

  protected static IStrategoTerm constSOpt3;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm constIS0;

  protected static IStrategoTerm constCons14;

  protected static IStrategoTerm constFBOX42;

  protected static IStrategoTerm constS59;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constFBOX41;

  protected static IStrategoTerm constS58;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constFBOX40;

  protected static IStrategoTerm constS57;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm constFBOX39;

  protected static IStrategoTerm constS56;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm constFBOX38;

  protected static IStrategoTerm constS55;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm constFBOX37;

  protected static IStrategoTerm constS54;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constFBOX36;

  protected static IStrategoTerm constS53;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constFBOX35;

  protected static IStrategoTerm constS52;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constS51;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constS50;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm constS49;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm constS48;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm constFBOX34;

  protected static IStrategoTerm constS47;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm constFBOX33;

  protected static IStrategoTerm constS46;

  protected static IStrategoTerm const48;

  protected static IStrategoTerm constFBOX32;

  protected static IStrategoTerm constS45;

  protected static IStrategoTerm const47;

  protected static IStrategoTerm constFBOX31;

  protected static IStrategoTerm constS44;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constFBOX30;

  protected static IStrategoTerm constS43;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm constFBOX29;

  protected static IStrategoTerm constS42;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm constCons13;

  protected static IStrategoTerm constFBOX28;

  protected static IStrategoTerm constS41;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm constFBOX27;

  protected static IStrategoTerm constS40;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm constFBOX26;

  protected static IStrategoTerm constS39;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm constFBOX25;

  protected static IStrategoTerm constS38;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm constFBOX24;

  protected static IStrategoTerm constS37;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm constFBOX23;

  protected static IStrategoTerm constCons12;

  protected static IStrategoTerm constFBOX22;

  protected static IStrategoTerm constFBOX21;

  protected static IStrategoTerm constCons11;

  protected static IStrategoTerm constSOpt2;

  protected static IStrategoTerm constVS0;

  protected static IStrategoTerm constS36;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm constS35;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm constS34;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm constFBOX20;

  protected static IStrategoTerm constS33;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm constS32;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm constCons10;

  protected static IStrategoTerm constCons9;

  protected static IStrategoTerm constCons8;

  protected static IStrategoTerm constFBOX19;

  protected static IStrategoTerm constS31;

  protected static IStrategoTerm const33;

  protected static IStrategoTerm constS30;

  protected static IStrategoTerm const32;

  protected static IStrategoTerm constCons7;

  protected static IStrategoTerm constS29;

  protected static IStrategoTerm const31;

  protected static IStrategoTerm constFBOX18;

  protected static IStrategoTerm constS28;

  protected static IStrategoTerm const30;

  protected static IStrategoTerm constFBOX17;

  protected static IStrategoTerm constCons6;

  protected static IStrategoTerm constS27;

  protected static IStrategoTerm const29;

  protected static IStrategoTerm constFBOX16;

  protected static IStrategoTerm constS26;

  protected static IStrategoTerm const28;

  protected static IStrategoTerm constCons5;

  protected static IStrategoTerm constS25;

  protected static IStrategoTerm const27;

  protected static IStrategoTerm constFBOX15;

  protected static IStrategoTerm constS24;

  protected static IStrategoTerm const26;

  protected static IStrategoTerm constCons4;

  protected static IStrategoTerm constSOpt1;

  protected static IStrategoTerm const25;

  protected static IStrategoTerm constS23;

  protected static IStrategoTerm const24;

  protected static IStrategoTerm constS22;

  protected static IStrategoTerm const23;

  protected static IStrategoTerm constS21;

  protected static IStrategoTerm const22;

  protected static IStrategoTerm constS20;

  protected static IStrategoTerm const21;

  protected static IStrategoTerm constS19;

  protected static IStrategoTerm const20;

  protected static IStrategoTerm constS18;

  protected static IStrategoTerm const19;

  protected static IStrategoTerm constS17;

  protected static IStrategoTerm const18;

  protected static IStrategoTerm constFBOX14;

  protected static IStrategoTerm constS16;

  protected static IStrategoTerm const17;

  protected static IStrategoTerm constFBOX13;

  protected static IStrategoTerm constS15;

  protected static IStrategoTerm const16;

  protected static IStrategoTerm constFBOX12;

  protected static IStrategoTerm constS14;

  protected static IStrategoTerm const15;

  protected static IStrategoTerm constFBOX11;

  protected static IStrategoTerm constS13;

  protected static IStrategoTerm const14;

  protected static IStrategoTerm constFBOX10;

  protected static IStrategoTerm constS12;

  protected static IStrategoTerm const13;

  protected static IStrategoTerm constFBOX9;

  protected static IStrategoTerm constS11;

  protected static IStrategoTerm const12;

  protected static IStrategoTerm constFBOX8;

  protected static IStrategoTerm constS10;

  protected static IStrategoTerm const11;

  protected static IStrategoTerm constFBOX7;

  protected static IStrategoTerm constS9;

  protected static IStrategoTerm const10;

  protected static IStrategoTerm constH0;

  protected static IStrategoTerm constCons3;

  protected static IStrategoTerm constFBOX6;

  protected static IStrategoTerm constS8;

  protected static IStrategoTerm const9;

  protected static IStrategoTerm constCons2;

  protected static IStrategoTerm constFBOX5;

  protected static IStrategoTerm constS7;

  protected static IStrategoTerm const8;

  protected static IStrategoTerm constFBOX4;

  protected static IStrategoTerm constS6;

  protected static IStrategoTerm const7;

  protected static IStrategoTerm constFBOX3;

  protected static IStrategoTerm constS5;

  protected static IStrategoTerm const6;

  protected static IStrategoTerm constFBOX2;

  protected static IStrategoTerm constS4;

  protected static IStrategoTerm const5;

  protected static IStrategoTerm constFBOX1;

  protected static IStrategoTerm constS3;

  protected static IStrategoTerm const4;

  protected static IStrategoTerm constFBOX0;

  protected static IStrategoTerm constS2;

  protected static IStrategoTerm const3;

  protected static IStrategoTerm constKW0;

  protected static IStrategoTerm constS1;

  protected static IStrategoTerm const2;

  protected static IStrategoTerm constCons1;

  protected static IStrategoTerm constS0;

  protected static IStrategoTerm const1;

  protected static IStrategoTerm constCons0;

  protected static IStrategoTerm constSOpt0;

  protected static IStrategoTerm const0;

  protected static IStrategoTerm constHS0;

  protected static IStrategoTerm constNil0;

  public static IStrategoConstructor _consConc_2;

  protected static IStrategoConstructor _consAssign_2;

  protected static IStrategoConstructor _consWhile_2;

  protected static IStrategoConstructor _consThrow_1;

  protected static IStrategoConstructor _consCatch_2;

  protected static IStrategoConstructor _consTry_2;

  protected static IStrategoConstructor _consExprName_1;

  protected static IStrategoConstructor _consMethodName_1;

  protected static IStrategoConstructor _consExprStm_1;

  protected static IStrategoConstructor _consSingleElemAnno_2;

  protected static IStrategoConstructor _consSynchronized_0;

  protected static IStrategoConstructor _consPackageName_1;

  protected static IStrategoConstructor _consTypeImportOnDemandDec_1;

  protected static IStrategoConstructor _consCompilationUnit_3;

  protected static IStrategoConstructor _consVoid_0;

  protected static IStrategoConstructor _consChars_1;

  protected static IStrategoConstructor _consString_1;

  protected static IStrategoConstructor _consDeci_1;

  protected static IStrategoConstructor _consLit_1;

  protected static IStrategoConstructor _consElemValPair_2;

  protected static IStrategoConstructor _consAnno_2;

  protected static IStrategoConstructor _consMarkerAnno_1;

  protected static IStrategoConstructor _consPublic_0;

  protected static IStrategoConstructor _consLazyOr_2;

  protected static IStrategoConstructor _consFalse_0;

  protected static IStrategoConstructor _consNewInstance_4;

  protected static IStrategoConstructor _consVarDec_2;

  protected static IStrategoConstructor _consClassOrInterfaceType_2;

  protected static IStrategoConstructor _consFieldDec_3;

  protected static IStrategoConstructor _consAmbName_1;

  protected static IStrategoConstructor _consMethodName_2;

  protected static IStrategoConstructor _consMethod_1;

  protected static IStrategoConstructor _consInvoke_2;

  protected static IStrategoConstructor _consLazyAnd_2;

  protected static IStrategoConstructor _consReturn_1;

  protected static IStrategoConstructor _consParam_3;

  protected static IStrategoConstructor _consBoolean_0;

  protected static IStrategoConstructor _consPrivate_0;

  protected static IStrategoConstructor _consStatic_0;

  protected static IStrategoConstructor _consMethodDecHead_6;

  protected static IStrategoConstructor _consMethodDec_2;

  protected static IStrategoConstructor _consPackageOrTypeName_2;

  protected static IStrategoConstructor _consPackageOrTypeName_1;

  protected static IStrategoConstructor _consTypeName_1;

  protected static IStrategoConstructor _consTypeName_2;

  protected static IStrategoConstructor _consNone_0;

  protected static IStrategoConstructor _consSome_1;

  protected static IStrategoConstructor _consIS_0;

  protected static IStrategoConstructor _consId_1;

  protected static IStrategoConstructor _consNoMethodBody_0;

  protected static IStrategoConstructor _consVS_0;

  protected static IStrategoConstructor _consV_2;

  protected static IStrategoConstructor _consBlock_1;

  protected static IStrategoConstructor _consNot_1;

  protected static IStrategoConstructor _consKW_0;

  protected static IStrategoConstructor _consFBOX_2;

  protected static IStrategoConstructor _consS_1;

  protected static IStrategoConstructor _consHS_0;

  protected static IStrategoConstructor _consSOpt_2;

  protected static IStrategoConstructor _consH_2;

  public static IStrategoConstructor _consDecError_2;

  public static IStrategoConstructor _consDecSoft_2;

  public static IStrategoConstructor _consRegularTypePattern_1;

  public static IStrategoConstructor _consSimpleAnnoPatternValue_2;

  public static IStrategoConstructor _consCoordinatorDec_2;

  public static IStrategoConstructor _consCoordinatorDecHead_1;

  public static IStrategoConstructor _consCoordinatorBody_1;

  public static IStrategoConstructor _consSelfex_1;

  public static IStrategoConstructor _consMutex_1;

  public static IStrategoConstructor _consConditionDec_1;

  public static IStrategoConstructor _consMethodAdditions_4;

  public static IStrategoConstructor _consMethodSignature_2;

  public static IStrategoConstructor _consRequires_1;

  public static IStrategoConstructor _consOnEntry_1;

  public static IStrategoConstructor _consOnExit_1;

  public static IStrategoConstructor _consDecParent_3;

  public static IStrategoConstructor _consDecWarning_3;

  public static IStrategoConstructor _consDecPrecedence_2;

  public static IStrategoConstructor _consDecAnno_4;

  public static IStrategoConstructor _consDecAnnoType_0;

  public static IStrategoConstructor _consDecAnnoConstructor_0;

  public static IStrategoConstructor _consDecAnnoMethod_0;

  public static IStrategoConstructor _consDecAnnoField_0;

  public static IStrategoConstructor _consAdviceDec_5;

  public static IStrategoConstructor _consBefore_1;

  public static IStrategoConstructor _consAfter_2;

  public static IStrategoConstructor _consAround_2;

  public static IStrategoConstructor _consReturning_0;

  public static IStrategoConstructor _consReturning_1;

  public static IStrategoConstructor _consThrowing_0;

  public static IStrategoConstructor _consThrowing_1;

  public static IStrategoConstructor _consIntertypeMethodDec_2;

  public static IStrategoConstructor _consIntertypeConstrDec_2;

  public static IStrategoConstructor _consIntertypeFieldDec_5;

  public static IStrategoConstructor _consIntertypeMethodDecHead_8;

  public static IStrategoConstructor _consIntertypeConstrDecHead_6;

  public static IStrategoConstructor _consAspectDec_2;

  public static IStrategoConstructor _consAspectDecHead_6;

  public static IStrategoConstructor _consPerTarget_1;

  public static IStrategoConstructor _consPerThis_1;

  public static IStrategoConstructor _consPerCFlow_1;

  public static IStrategoConstructor _consPerCFlowBelow_1;

  public static IStrategoConstructor _consPerTypeWithin_1;

  public static IStrategoConstructor _consIsSingleton_0;

  public static IStrategoConstructor _consAspectBody_1;

  public static IStrategoConstructor _consPrivileged_0;

  public static IStrategoConstructor _consSimpleNamePattern_1;

  public static IStrategoConstructor _consFormalWildcard_0;

  public static IStrategoConstructor _consVarArityParamPattern_1;

  public static IStrategoConstructor _consGenericTypePattern_2;

  public static IStrategoConstructor _consGenericSubtypePattern_2;

  public static IStrategoConstructor _consNamePattern_1;

  public static IStrategoConstructor _consNamePattern_2;

  public static IStrategoConstructor _consWildcardNamePattern_2;

  public static IStrategoConstructor _consRefTypePattern_1;

  public static IStrategoConstructor _consPrimTypePattern_1;

  public static IStrategoConstructor _consAnnoTypePattern_2;

  public static IStrategoConstructor _consMethodPattern_6;

  public static IStrategoConstructor _consConstrPattern_5;

  public static IStrategoConstructor _consFieldPattern_4;

  public static IStrategoConstructor _consMemberName_1;

  public static IStrategoConstructor _consMemberName_2;

  public static IStrategoConstructor _consWildcardMemberName_2;

  public static IStrategoConstructor _consConstrName_0;

  public static IStrategoConstructor _consConstrName_1;

  public static IStrategoConstructor _consWildcardConstrName_1;

  public static IStrategoConstructor _consModPattern_1;

  public static IStrategoConstructor _consThrowsPattern_1;

  public static IStrategoConstructor _consNotThrowsCondition_1;

  public static IStrategoConstructor _consThrowsCondition_1;

  public static IStrategoConstructor _consSimpleAnnoPattern_1;

  public static IStrategoConstructor _consSimpleAnnoPatternExact_1;

  public static IStrategoConstructor _consAnnoPattern_1;

  public static IStrategoConstructor _consPointcutDec_2;

  public static IStrategoConstructor _consPointcutDecHead_3;

  public static IStrategoConstructor _consPointcutBody_1;

  public static IStrategoConstructor _consNoPointcutBody_0;

  public static IStrategoConstructor _consNotComp_1;

  public static IStrategoConstructor _consAndComp_2;

  public static IStrategoConstructor _consOrComp_2;

  public static IStrategoConstructor _consCall_1;

  public static IStrategoConstructor _consExec_1;

  public static IStrategoConstructor _consInitExec_1;

  public static IStrategoConstructor _consPreInitExec_1;

  public static IStrategoConstructor _consStaticInitExec_1;

  public static IStrategoConstructor _consGetField_1;

  public static IStrategoConstructor _consSetField_1;

  public static IStrategoConstructor _consHandler_1;

  public static IStrategoConstructor _consAdviceExec_0;

  public static IStrategoConstructor _consWithin_1;

  public static IStrategoConstructor _consWithinCode_1;

  public static IStrategoConstructor _consCFlow_1;

  public static IStrategoConstructor _consCFlowBelow_1;

  public static IStrategoConstructor _consIf_1;

  public static IStrategoConstructor _consThis_1;

  public static IStrategoConstructor _consTarget_1;

  public static IStrategoConstructor _consArgs_1;

  public static IStrategoConstructor _consAtThis_1;

  public static IStrategoConstructor _consAtTarget_1;

  public static IStrategoConstructor _consAtWithin_1;

  public static IStrategoConstructor _consAtWithinCode_1;

  public static IStrategoConstructor _consAtAnno_1;

  public static IStrategoConstructor _consAtArgs_1;

  public static IStrategoConstructor _consNamedPointcut_2;

  public static IStrategoConstructor _consPointcutName_1;

  public static IStrategoConstructor _consPointcutName_2;

  public static IStrategoConstructor _consWildcard_0;

  public static IStrategoConstructor _consDotWildcard_0;

  public static IStrategoConstructor _consSubtype_1;

  public static IStrategoConstructor _consProceed_0;

  public static Context init(Context context)
  { 
    synchronized(transform.class)
    { 
      if(isIniting)
        return null;
      try
      { 
        isIniting = true;
        ITermFactory termFactory = context.getFactory();
        if(constantFactory == null)
        { 
          initConstructors(termFactory);
          initConstants(termFactory);
        }
        if(initedContext == null || initedContext.get() != context)
        { 
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.java_front.Main.init(context);
          org.strategoxt.stratego_gpp.Main.init(context);
          org.strategoxt.stratego_sglr.Main.init(context);
          context.registerComponent("cool");
        }
        initedContext = new WeakReference<Context>(context);
        constantFactory = termFactory;
      }
      finally
      { 
        isIniting = false;
      }
      return context;
    }
  }

  public static Context init()
  { 
    return init(new Context());
  }

  public static void main(String args[])
  { 
    Context context = init();
    context.setStandAlone(true);
    try
    { 
      IStrategoTerm result;
      try
      { 
        result = context.invokeStrategyCLI(main_0_0.instance, "transform", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("transform" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
        context.printStackTrace();
        context.setStandAlone(false);
        System.exit(1);
      }
      else
      { 
        System.out.println(result);
        context.setStandAlone(false);
        System.exit(0);
      }
    }
    catch(StrategoErrorExit exit)
    { 
      context.setStandAlone(false);
      System.err.println(exit.getLocalizedMessage());
      System.exit(exit.getValue());
    }
    catch(StrategoExit exit)
    { 
      context.setStandAlone(false);
      System.exit(exit.getValue());
    }
  }

  public static IStrategoTerm mainNoExit(String ... args) throws StrategoExit
  { 
    return mainNoExit(new Context(), args);
  }

  public static IStrategoTerm mainNoExit(Context context, String ... args) throws StrategoExit
  { 
    try
    { 
      init(context);
      return context.invokeStrategyCLI(main_0_0.instance, "transform", args);
    }
    finally
    { 
      context.getIOAgent().closeAllFiles();
    }
  }

  public static Strategy getMainStrategy()
  { 
    return main_0_0.instance;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consAssign_2 = termFactory.makeConstructor("Assign", 2);
    _consWhile_2 = termFactory.makeConstructor("While", 2);
    _consThrow_1 = termFactory.makeConstructor("Throw", 1);
    _consCatch_2 = termFactory.makeConstructor("Catch", 2);
    _consTry_2 = termFactory.makeConstructor("Try", 2);
    _consExprName_1 = termFactory.makeConstructor("ExprName", 1);
    _consMethodName_1 = termFactory.makeConstructor("MethodName", 1);
    _consExprStm_1 = termFactory.makeConstructor("ExprStm", 1);
    _consSingleElemAnno_2 = termFactory.makeConstructor("SingleElemAnno", 2);
    _consSynchronized_0 = termFactory.makeConstructor("Synchronized", 0);
    _consPackageName_1 = termFactory.makeConstructor("PackageName", 1);
    _consTypeImportOnDemandDec_1 = termFactory.makeConstructor("TypeImportOnDemandDec", 1);
    _consCompilationUnit_3 = termFactory.makeConstructor("CompilationUnit", 3);
    _consVoid_0 = termFactory.makeConstructor("Void", 0);
    _consChars_1 = termFactory.makeConstructor("Chars", 1);
    _consString_1 = termFactory.makeConstructor("String", 1);
    _consDeci_1 = termFactory.makeConstructor("Deci", 1);
    _consLit_1 = termFactory.makeConstructor("Lit", 1);
    _consElemValPair_2 = termFactory.makeConstructor("ElemValPair", 2);
    _consAnno_2 = termFactory.makeConstructor("Anno", 2);
    _consMarkerAnno_1 = termFactory.makeConstructor("MarkerAnno", 1);
    _consPublic_0 = termFactory.makeConstructor("Public", 0);
    _consLazyOr_2 = termFactory.makeConstructor("LazyOr", 2);
    _consFalse_0 = termFactory.makeConstructor("False", 0);
    _consNewInstance_4 = termFactory.makeConstructor("NewInstance", 4);
    _consVarDec_2 = termFactory.makeConstructor("VarDec", 2);
    _consClassOrInterfaceType_2 = termFactory.makeConstructor("ClassOrInterfaceType", 2);
    _consFieldDec_3 = termFactory.makeConstructor("FieldDec", 3);
    _consAmbName_1 = termFactory.makeConstructor("AmbName", 1);
    _consMethodName_2 = termFactory.makeConstructor("MethodName", 2);
    _consMethod_1 = termFactory.makeConstructor("Method", 1);
    _consInvoke_2 = termFactory.makeConstructor("Invoke", 2);
    _consLazyAnd_2 = termFactory.makeConstructor("LazyAnd", 2);
    _consReturn_1 = termFactory.makeConstructor("Return", 1);
    _consParam_3 = termFactory.makeConstructor("Param", 3);
    _consBoolean_0 = termFactory.makeConstructor("Boolean", 0);
    _consPrivate_0 = termFactory.makeConstructor("Private", 0);
    _consStatic_0 = termFactory.makeConstructor("Static", 0);
    _consMethodDecHead_6 = termFactory.makeConstructor("MethodDecHead", 6);
    _consMethodDec_2 = termFactory.makeConstructor("MethodDec", 2);
    _consPackageOrTypeName_2 = termFactory.makeConstructor("PackageOrTypeName", 2);
    _consPackageOrTypeName_1 = termFactory.makeConstructor("PackageOrTypeName", 1);
    _consTypeName_1 = termFactory.makeConstructor("TypeName", 1);
    _consTypeName_2 = termFactory.makeConstructor("TypeName", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consIS_0 = termFactory.makeConstructor("IS", 0);
    _consId_1 = termFactory.makeConstructor("Id", 1);
    _consNoMethodBody_0 = termFactory.makeConstructor("NoMethodBody", 0);
    _consVS_0 = termFactory.makeConstructor("VS", 0);
    _consV_2 = termFactory.makeConstructor("V", 2);
    _consBlock_1 = termFactory.makeConstructor("Block", 1);
    _consNot_1 = termFactory.makeConstructor("Not", 1);
    _consKW_0 = termFactory.makeConstructor("KW", 0);
    _consFBOX_2 = termFactory.makeConstructor("FBOX", 2);
    _consS_1 = termFactory.makeConstructor("S", 1);
    _consHS_0 = termFactory.makeConstructor("HS", 0);
    _consSOpt_2 = termFactory.makeConstructor("SOpt", 2);
    _consH_2 = termFactory.makeConstructor("H", 2);
    _consDecError_2 = termFactory.makeConstructor("DecError", 2);
    _consDecSoft_2 = termFactory.makeConstructor("DecSoft", 2);
    _consRegularTypePattern_1 = termFactory.makeConstructor("RegularTypePattern", 1);
    _consSimpleAnnoPatternValue_2 = termFactory.makeConstructor("SimpleAnnoPatternValue", 2);
    _consCoordinatorDec_2 = termFactory.makeConstructor("CoordinatorDec", 2);
    _consCoordinatorDecHead_1 = termFactory.makeConstructor("CoordinatorDecHead", 1);
    _consCoordinatorBody_1 = termFactory.makeConstructor("CoordinatorBody", 1);
    _consSelfex_1 = termFactory.makeConstructor("Selfex", 1);
    _consMutex_1 = termFactory.makeConstructor("Mutex", 1);
    _consConditionDec_1 = termFactory.makeConstructor("ConditionDec", 1);
    _consMethodAdditions_4 = termFactory.makeConstructor("MethodAdditions", 4);
    _consMethodSignature_2 = termFactory.makeConstructor("MethodSignature", 2);
    _consRequires_1 = termFactory.makeConstructor("Requires", 1);
    _consOnEntry_1 = termFactory.makeConstructor("OnEntry", 1);
    _consOnExit_1 = termFactory.makeConstructor("OnExit", 1);
    _consDecParent_3 = termFactory.makeConstructor("DecParent", 3);
    _consDecWarning_3 = termFactory.makeConstructor("DecWarning", 3);
    _consDecPrecedence_2 = termFactory.makeConstructor("DecPrecedence", 2);
    _consDecAnno_4 = termFactory.makeConstructor("DecAnno", 4);
    _consDecAnnoType_0 = termFactory.makeConstructor("DecAnnoType", 0);
    _consDecAnnoConstructor_0 = termFactory.makeConstructor("DecAnnoConstructor", 0);
    _consDecAnnoMethod_0 = termFactory.makeConstructor("DecAnnoMethod", 0);
    _consDecAnnoField_0 = termFactory.makeConstructor("DecAnnoField", 0);
    _consAdviceDec_5 = termFactory.makeConstructor("AdviceDec", 5);
    _consBefore_1 = termFactory.makeConstructor("Before", 1);
    _consAfter_2 = termFactory.makeConstructor("After", 2);
    _consAround_2 = termFactory.makeConstructor("Around", 2);
    _consReturning_0 = termFactory.makeConstructor("Returning", 0);
    _consReturning_1 = termFactory.makeConstructor("Returning", 1);
    _consThrowing_0 = termFactory.makeConstructor("Throwing", 0);
    _consThrowing_1 = termFactory.makeConstructor("Throwing", 1);
    _consIntertypeMethodDec_2 = termFactory.makeConstructor("IntertypeMethodDec", 2);
    _consIntertypeConstrDec_2 = termFactory.makeConstructor("IntertypeConstrDec", 2);
    _consIntertypeFieldDec_5 = termFactory.makeConstructor("IntertypeFieldDec", 5);
    _consIntertypeMethodDecHead_8 = termFactory.makeConstructor("IntertypeMethodDecHead", 8);
    _consIntertypeConstrDecHead_6 = termFactory.makeConstructor("IntertypeConstrDecHead", 6);
    _consAspectDec_2 = termFactory.makeConstructor("AspectDec", 2);
    _consAspectDecHead_6 = termFactory.makeConstructor("AspectDecHead", 6);
    _consPerTarget_1 = termFactory.makeConstructor("PerTarget", 1);
    _consPerThis_1 = termFactory.makeConstructor("PerThis", 1);
    _consPerCFlow_1 = termFactory.makeConstructor("PerCFlow", 1);
    _consPerCFlowBelow_1 = termFactory.makeConstructor("PerCFlowBelow", 1);
    _consPerTypeWithin_1 = termFactory.makeConstructor("PerTypeWithin", 1);
    _consIsSingleton_0 = termFactory.makeConstructor("IsSingleton", 0);
    _consAspectBody_1 = termFactory.makeConstructor("AspectBody", 1);
    _consPrivileged_0 = termFactory.makeConstructor("Privileged", 0);
    _consSimpleNamePattern_1 = termFactory.makeConstructor("SimpleNamePattern", 1);
    _consFormalWildcard_0 = termFactory.makeConstructor("FormalWildcard", 0);
    _consVarArityParamPattern_1 = termFactory.makeConstructor("VarArityParamPattern", 1);
    _consGenericTypePattern_2 = termFactory.makeConstructor("GenericTypePattern", 2);
    _consGenericSubtypePattern_2 = termFactory.makeConstructor("GenericSubtypePattern", 2);
    _consNamePattern_1 = termFactory.makeConstructor("NamePattern", 1);
    _consNamePattern_2 = termFactory.makeConstructor("NamePattern", 2);
    _consWildcardNamePattern_2 = termFactory.makeConstructor("WildcardNamePattern", 2);
    _consRefTypePattern_1 = termFactory.makeConstructor("RefTypePattern", 1);
    _consPrimTypePattern_1 = termFactory.makeConstructor("PrimTypePattern", 1);
    _consAnnoTypePattern_2 = termFactory.makeConstructor("AnnoTypePattern", 2);
    _consMethodPattern_6 = termFactory.makeConstructor("MethodPattern", 6);
    _consConstrPattern_5 = termFactory.makeConstructor("ConstrPattern", 5);
    _consFieldPattern_4 = termFactory.makeConstructor("FieldPattern", 4);
    _consMemberName_1 = termFactory.makeConstructor("MemberName", 1);
    _consMemberName_2 = termFactory.makeConstructor("MemberName", 2);
    _consWildcardMemberName_2 = termFactory.makeConstructor("WildcardMemberName", 2);
    _consConstrName_0 = termFactory.makeConstructor("ConstrName", 0);
    _consConstrName_1 = termFactory.makeConstructor("ConstrName", 1);
    _consWildcardConstrName_1 = termFactory.makeConstructor("WildcardConstrName", 1);
    _consModPattern_1 = termFactory.makeConstructor("ModPattern", 1);
    _consThrowsPattern_1 = termFactory.makeConstructor("ThrowsPattern", 1);
    _consNotThrowsCondition_1 = termFactory.makeConstructor("NotThrowsCondition", 1);
    _consThrowsCondition_1 = termFactory.makeConstructor("ThrowsCondition", 1);
    _consSimpleAnnoPattern_1 = termFactory.makeConstructor("SimpleAnnoPattern", 1);
    _consSimpleAnnoPatternExact_1 = termFactory.makeConstructor("SimpleAnnoPatternExact", 1);
    _consAnnoPattern_1 = termFactory.makeConstructor("AnnoPattern", 1);
    _consPointcutDec_2 = termFactory.makeConstructor("PointcutDec", 2);
    _consPointcutDecHead_3 = termFactory.makeConstructor("PointcutDecHead", 3);
    _consPointcutBody_1 = termFactory.makeConstructor("PointcutBody", 1);
    _consNoPointcutBody_0 = termFactory.makeConstructor("NoPointcutBody", 0);
    _consNotComp_1 = termFactory.makeConstructor("NotComp", 1);
    _consAndComp_2 = termFactory.makeConstructor("AndComp", 2);
    _consOrComp_2 = termFactory.makeConstructor("OrComp", 2);
    _consCall_1 = termFactory.makeConstructor("Call", 1);
    _consExec_1 = termFactory.makeConstructor("Exec", 1);
    _consInitExec_1 = termFactory.makeConstructor("InitExec", 1);
    _consPreInitExec_1 = termFactory.makeConstructor("PreInitExec", 1);
    _consStaticInitExec_1 = termFactory.makeConstructor("StaticInitExec", 1);
    _consGetField_1 = termFactory.makeConstructor("GetField", 1);
    _consSetField_1 = termFactory.makeConstructor("SetField", 1);
    _consHandler_1 = termFactory.makeConstructor("Handler", 1);
    _consAdviceExec_0 = termFactory.makeConstructor("AdviceExec", 0);
    _consWithin_1 = termFactory.makeConstructor("Within", 1);
    _consWithinCode_1 = termFactory.makeConstructor("WithinCode", 1);
    _consCFlow_1 = termFactory.makeConstructor("CFlow", 1);
    _consCFlowBelow_1 = termFactory.makeConstructor("CFlowBelow", 1);
    _consIf_1 = termFactory.makeConstructor("If", 1);
    _consThis_1 = termFactory.makeConstructor("This", 1);
    _consTarget_1 = termFactory.makeConstructor("Target", 1);
    _consArgs_1 = termFactory.makeConstructor("Args", 1);
    _consAtThis_1 = termFactory.makeConstructor("AtThis", 1);
    _consAtTarget_1 = termFactory.makeConstructor("AtTarget", 1);
    _consAtWithin_1 = termFactory.makeConstructor("AtWithin", 1);
    _consAtWithinCode_1 = termFactory.makeConstructor("AtWithinCode", 1);
    _consAtAnno_1 = termFactory.makeConstructor("AtAnno", 1);
    _consAtArgs_1 = termFactory.makeConstructor("AtArgs", 1);
    _consNamedPointcut_2 = termFactory.makeConstructor("NamedPointcut", 2);
    _consPointcutName_1 = termFactory.makeConstructor("PointcutName", 1);
    _consPointcutName_2 = termFactory.makeConstructor("PointcutName", 2);
    _consWildcard_0 = termFactory.makeConstructor("Wildcard", 0);
    _consDotWildcard_0 = termFactory.makeConstructor("DotWildcard", 0);
    _consSubtype_1 = termFactory.makeConstructor("Subtype", 1);
    _consProceed_0 = termFactory.makeConstructor("Proceed", 0);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil0 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    constHS0 = termFactory.makeAppl(transform._consHS_0, NO_TERMS);
    const0 = termFactory.makeString("0");
    constSOpt0 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{cool.constHS0, cool.const0});
    constCons0 = (IStrategoTerm)termFactory.makeListCons(cool.constSOpt0, (IStrategoList)cool.constNil0);
    const1 = termFactory.makeString(")");
    constS0 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const1});
    constCons1 = (IStrategoTerm)termFactory.makeListCons(cool.constS0, (IStrategoList)cool.constNil0);
    const2 = termFactory.makeString("(");
    constS1 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const2});
    constKW0 = termFactory.makeAppl(transform._consKW_0, NO_TERMS);
    const3 = termFactory.makeString("initialization");
    constS2 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const3});
    constFBOX0 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS2});
    const4 = termFactory.makeString("preinitialization");
    constS3 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const4});
    constFBOX1 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS3});
    const5 = termFactory.makeString("staticinitialization");
    constS4 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const5});
    constFBOX2 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS4});
    const6 = termFactory.makeString("get");
    constS5 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const6});
    constFBOX3 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS5});
    const7 = termFactory.makeString("set");
    constS6 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const7});
    constFBOX4 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS6});
    const8 = termFactory.makeString("handler");
    constS7 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const8});
    constFBOX5 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS7});
    constCons2 = (IStrategoTerm)termFactory.makeListCons(cool.constS1, (IStrategoList)cool.constCons1);
    const9 = termFactory.makeString("adviceexecution");
    constS8 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const9});
    constFBOX6 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS8});
    constCons3 = (IStrategoTerm)termFactory.makeListCons(cool.constFBOX6, (IStrategoList)cool.constCons2);
    constH0 = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, cool.constCons3});
    const10 = termFactory.makeString("within");
    constS9 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const10});
    constFBOX7 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS9});
    const11 = termFactory.makeString("withincode");
    constS10 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const11});
    constFBOX8 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS10});
    const12 = termFactory.makeString("cflow");
    constS11 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const12});
    constFBOX9 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS11});
    const13 = termFactory.makeString("cflowbelow");
    constS12 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const13});
    constFBOX10 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS12});
    const14 = termFactory.makeString("if");
    constS13 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const14});
    constFBOX11 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS13});
    const15 = termFactory.makeString("this");
    constS14 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const15});
    constFBOX12 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS14});
    const16 = termFactory.makeString("target");
    constS15 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const16});
    constFBOX13 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS15});
    const17 = termFactory.makeString("args");
    constS16 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const17});
    constFBOX14 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS16});
    const18 = termFactory.makeString("@this");
    constS17 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const18});
    const19 = termFactory.makeString("@target");
    constS18 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const19});
    const20 = termFactory.makeString("@within");
    constS19 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const20});
    const21 = termFactory.makeString("@withincode");
    constS20 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const21});
    const22 = termFactory.makeString("@annotation");
    constS21 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const22});
    const23 = termFactory.makeString("@args");
    constS22 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const23});
    const24 = termFactory.makeString(".");
    constS23 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const24});
    const25 = termFactory.makeString("1");
    constSOpt1 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{cool.constHS0, cool.const25});
    constCons4 = (IStrategoTerm)termFactory.makeListCons(cool.constSOpt1, (IStrategoList)cool.constNil0);
    const26 = termFactory.makeString("pointcut");
    constS24 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const26});
    constFBOX15 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS24});
    const27 = termFactory.makeString(";");
    constS25 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const27});
    constCons5 = (IStrategoTerm)termFactory.makeListCons(cool.constS25, (IStrategoList)cool.constNil0);
    const28 = termFactory.makeString(":");
    constS26 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const28});
    constFBOX16 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS25});
    const29 = termFactory.makeString("+");
    constS27 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const29});
    constCons6 = (IStrategoTerm)termFactory.makeListCons(cool.constS27, (IStrategoList)cool.constNil0);
    constFBOX17 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS23});
    const30 = termFactory.makeString("..");
    constS28 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const30});
    constFBOX18 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS28});
    const31 = termFactory.makeString("...");
    constS29 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const31});
    constCons7 = (IStrategoTerm)termFactory.makeListCons(cool.constS29, (IStrategoList)cool.constNil0);
    const32 = termFactory.makeString("*");
    constS30 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const32});
    const33 = termFactory.makeString("new");
    constS31 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const33});
    constFBOX19 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS31});
    constCons8 = (IStrategoTerm)termFactory.makeListCons(cool.constFBOX19, (IStrategoList)cool.constNil0);
    constCons9 = (IStrategoTerm)termFactory.makeListCons(cool.constS23, (IStrategoList)cool.constCons8);
    constCons10 = (IStrategoTerm)termFactory.makeListCons(cool.constS28, (IStrategoList)cool.constCons8);
    const34 = termFactory.makeString("!");
    constS32 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const34});
    const35 = termFactory.makeString("throws");
    constS33 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const35});
    constFBOX20 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS33});
    const36 = termFactory.makeString("@");
    constS34 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const36});
    const37 = termFactory.makeString("&&");
    constS35 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const37});
    const38 = termFactory.makeString("||");
    constS36 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const38});
    constVS0 = termFactory.makeAppl(transform._consVS_0, NO_TERMS);
    constSOpt2 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{cool.constVS0, cool.const0});
    constCons11 = (IStrategoTerm)termFactory.makeListCons(cool.constSOpt2, (IStrategoList)cool.constNil0);
    constFBOX21 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS26});
    constFBOX22 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS0});
    constCons12 = (IStrategoTerm)termFactory.makeListCons(cool.constFBOX22, (IStrategoList)cool.constNil0);
    constFBOX23 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS1});
    const39 = termFactory.makeString("before");
    constS37 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const39});
    constFBOX24 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS37});
    const40 = termFactory.makeString("after");
    constS38 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const40});
    constFBOX25 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS38});
    const41 = termFactory.makeString("around");
    constS39 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const41});
    constFBOX26 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS39});
    const42 = termFactory.makeString("returning");
    constS40 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const42});
    constFBOX27 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS40});
    const43 = termFactory.makeString("throwing");
    constS41 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const43});
    constFBOX28 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS41});
    constCons13 = (IStrategoTerm)termFactory.makeListCons(cool.constFBOX16, (IStrategoList)cool.constNil0);
    const44 = termFactory.makeString("parents");
    constS42 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const44});
    constFBOX29 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS42});
    const45 = termFactory.makeString("declare");
    constS43 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const45});
    constFBOX30 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS43});
    const46 = termFactory.makeString("warning");
    constS44 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const46});
    constFBOX31 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS44});
    const47 = termFactory.makeString("error");
    constS45 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const47});
    constFBOX32 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS45});
    const48 = termFactory.makeString("soft");
    constS46 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const48});
    constFBOX33 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS46});
    const49 = termFactory.makeString("precedence");
    constS47 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const49});
    constFBOX34 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS47});
    const50 = termFactory.makeString("@type");
    constS48 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const50});
    const51 = termFactory.makeString("@constructor");
    constS49 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const51});
    const52 = termFactory.makeString("@method");
    constS50 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const52});
    const53 = termFactory.makeString("@field");
    constS51 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const53});
    const54 = termFactory.makeString("aspect");
    constS52 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const54});
    constFBOX35 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS52});
    const55 = termFactory.makeString("pertarget");
    constS53 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const55});
    constFBOX36 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS53});
    const56 = termFactory.makeString("perthis");
    constS54 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const56});
    constFBOX37 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS54});
    const57 = termFactory.makeString("percflow");
    constS55 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const57});
    constFBOX38 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS55});
    const58 = termFactory.makeString("percflowbelow");
    constS56 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const58});
    constFBOX39 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS56});
    const59 = termFactory.makeString("pertypewithin");
    constS57 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const59});
    constFBOX40 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS57});
    const60 = termFactory.makeString("issingleton");
    constS58 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const60});
    constFBOX41 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS58});
    const61 = termFactory.makeString("}");
    constS59 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const61});
    constFBOX42 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS59});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(cool.constFBOX42, (IStrategoList)cool.constNil0);
    constIS0 = termFactory.makeAppl(transform._consIS_0, NO_TERMS);
    const62 = termFactory.makeString("2");
    constSOpt3 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{cool.constIS0, cool.const62});
    constCons15 = (IStrategoTerm)termFactory.makeListCons(cool.constSOpt3, (IStrategoList)cool.constNil0);
    constCons16 = (IStrategoTerm)termFactory.makeListCons(cool.constSOpt2, (IStrategoList)cool.constCons15);
    constSOpt4 = termFactory.makeAppl(transform._consSOpt_2, new IStrategoTerm[]{cool.constVS0, cool.const25});
    constCons17 = (IStrategoTerm)termFactory.makeListCons(cool.constSOpt4, (IStrategoList)cool.constNil0);
    const63 = termFactory.makeString("{");
    constS60 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const63});
    constFBOX43 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS60});
    const64 = termFactory.makeString("privileged");
    constS61 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const64});
    constFBOX44 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS61});
    const65 = termFactory.makeString("proceed");
    constS62 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const65});
    constFBOX45 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS62});
    const66 = termFactory.makeString("call");
    constS63 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const66});
    constFBOX46 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS63});
    const67 = termFactory.makeString("execution");
    constS64 = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{cool.const67});
    constFBOX47 = termFactory.makeAppl(transform._consFBOX_2, new IStrategoTerm[]{cool.constKW0, cool.constS64});
    const68 = termFactory.makeInt(80);
    const69 = termFactory.makeString("arguments:");
    const70 = termFactory.makeString("Coord");
    constCons18 = (IStrategoTerm)termFactory.makeListCons(cool.const70, (IStrategoList)cool.constNil0);
    const71 = termFactory.makeString("java");
    const72 = termFactory.makeString("w");
    constCoolTbl = new ImportTerm(termFactory, cool.class, "/cool/", "cool.tbl");
    constStatic0 = termFactory.makeAppl(transform._consStatic_0, NO_TERMS);
    constCons19 = (IStrategoTerm)termFactory.makeListCons(cool.constStatic0, (IStrategoList)cool.constNil0);
    constPrivate0 = termFactory.makeAppl(transform._consPrivate_0, NO_TERMS);
    constCons20 = (IStrategoTerm)termFactory.makeListCons(cool.constPrivate0, (IStrategoList)cool.constCons19);
    constNone0 = termFactory.makeAppl(transform._consNone_0, NO_TERMS);
    constBoolean0 = termFactory.makeAppl(transform._consBoolean_0, NO_TERMS);
    const73 = termFactory.makeString("isRunByOthers");
    constId0 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const73});
    const74 = termFactory.makeString("List");
    constId1 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const74});
    constTypeName0 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId1});
    const75 = termFactory.makeString("methState");
    constId2 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const75});
    constParam0 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, cool.constTypeName0, cool.constId2});
    constCons21 = (IStrategoTerm)termFactory.makeListCons(cool.constParam0, (IStrategoList)cool.constNil0);
    constMethodDecHead0 = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{cool.constCons20, cool.constNone0, cool.constBoolean0, cool.constId0, cool.constCons21, cool.constNone0});
    constAmbName0 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{cool.constId2});
    const76 = termFactory.makeString("isEmpty");
    constId3 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const76});
    constMethodName0 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName0, cool.constId3});
    constMethod0 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName0});
    constInvoke0 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cool.constMethod0, cool.constNil0});
    constNot0 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{cool.constInvoke0});
    const77 = termFactory.makeString("contains");
    constId4 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const77});
    constMethodName1 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName0, cool.constId4});
    constMethod1 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName1});
    const78 = termFactory.makeString("Thread");
    constId5 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const78});
    constAmbName1 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{cool.constId5});
    const79 = termFactory.makeString("currentThread");
    constId6 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const79});
    constMethodName2 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName1, cool.constId6});
    constMethod2 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName2});
    constInvoke1 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cool.constMethod2, cool.constNil0});
    constCons22 = (IStrategoTerm)termFactory.makeListCons(cool.constInvoke1, (IStrategoList)cool.constNil0);
    constInvoke2 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cool.constMethod1, cool.constCons22});
    constNot1 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{cool.constInvoke2});
    constLazyAnd0 = termFactory.makeAppl(transform._consLazyAnd_2, new IStrategoTerm[]{cool.constNot0, cool.constNot1});
    constSome0 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{cool.constLazyAnd0});
    constReturn0 = termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{cool.constSome0});
    constCons23 = (IStrategoTerm)termFactory.makeListCons(cool.constReturn0, (IStrategoList)cool.constNil0);
    constBlock0 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{cool.constCons23});
    constMethodDec0 = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{cool.constMethodDecHead0, cool.constBlock0});
    constCons24 = (IStrategoTerm)termFactory.makeListCons(cool.constPrivate0, (IStrategoList)cool.constNil0);
    constClassOrInterfaceType0 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cool.constTypeName0, cool.constNone0});
    const80 = termFactory.makeString("Collections");
    constId7 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const80});
    constAmbName2 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{cool.constId7});
    const81 = termFactory.makeString("synchronizedList");
    constId8 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const81});
    constMethodName3 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName2, cool.constId8});
    constMethod3 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName3});
    const82 = termFactory.makeString("Vector");
    constId9 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const82});
    constTypeName1 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId9});
    constClassOrInterfaceType1 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cool.constTypeName1, cool.constNone0});
    constNewInstance0 = termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{cool.constNone0, cool.constClassOrInterfaceType1, cool.constNil0, cool.constNone0});
    constCons25 = (IStrategoTerm)termFactory.makeListCons(cool.constNewInstance0, (IStrategoList)cool.constNil0);
    constInvoke3 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cool.constMethod3, cool.constCons25});
    const83 = termFactory.makeString("State");
    constCons26 = (IStrategoTerm)termFactory.makeListCons(cool.const83, (IStrategoList)cool.constNil0);
    const84 = termFactory.makeString("requires_");
    const85 = termFactory.makeString("on_entry_");
    const86 = termFactory.makeString("on_exit_");
    const87 = termFactory.makeInt(0);
    constFalse0 = termFactory.makeAppl(transform._consFalse_0, NO_TERMS);
    const88 = termFactory.makeInt(1);
    constPrivileged0 = termFactory.makeAppl(transform._consPrivileged_0, NO_TERMS);
    constCons27 = (IStrategoTerm)termFactory.makeListCons(cool.constPrivileged0, (IStrategoList)cool.constNil0);
    constPublic0 = termFactory.makeAppl(transform._consPublic_0, NO_TERMS);
    constCons28 = (IStrategoTerm)termFactory.makeListCons(cool.constPublic0, (IStrategoList)cool.constCons27);
    const89 = termFactory.makeString("cool");
    constId10 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const89});
    constPackageOrTypeName0 = termFactory.makeAppl(transform._consPackageOrTypeName_1, new IStrategoTerm[]{cool.constId10});
    const90 = termFactory.makeString("runtime");
    constId11 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const90});
    constPackageOrTypeName1 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{cool.constPackageOrTypeName0, cool.constId11});
    const91 = termFactory.makeString("CoolAspect");
    constId12 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const91});
    constTypeName2 = termFactory.makeAppl(transform._consTypeName_2, new IStrategoTerm[]{cool.constPackageOrTypeName1, cool.constId12});
    constMarkerAnno0 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{cool.constTypeName2});
    constCons29 = (IStrategoTerm)termFactory.makeListCons(cool.constMarkerAnno0, (IStrategoList)cool.constCons28);
    constAnnoPattern0 = termFactory.makeAppl(transform._consAnnoPattern_1, new IStrategoTerm[]{cool.constNil0});
    constModPattern0 = termFactory.makeAppl(transform._consModPattern_1, new IStrategoTerm[]{cool.constNil0});
    constFormalWildcard0 = termFactory.makeAppl(transform._consFormalWildcard_0, NO_TERMS);
    constCons30 = (IStrategoTerm)termFactory.makeListCons(cool.constFormalWildcard0, (IStrategoList)cool.constNil0);
    constCons31 = (IStrategoTerm)termFactory.makeListCons(cool.constPublic0, (IStrategoList)cool.constNil0);
    const92 = termFactory.makeString("offset");
    constId13 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const92});
    const93 = termFactory.makeString("column");
    constId14 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const93});
    const94 = termFactory.makeString("endLine");
    constId15 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const94});
    const95 = termFactory.makeString("startLine");
    constId16 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const95});
    const96 = termFactory.makeString("file");
    constId17 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const96});
    constVoid0 = termFactory.makeAppl(transform._consVoid_0, NO_TERMS);
    const97 = termFactory.makeString("util");
    constId18 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const97});
    constCons32 = (IStrategoTerm)termFactory.makeListCons(cool.constId18, (IStrategoList)cool.constNil0);
    constId19 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const71});
    constCons33 = (IStrategoTerm)termFactory.makeListCons(cool.constId19, (IStrategoList)cool.constCons32);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{cool.constCons33});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{cool.constPackageName0});
    constCons34 = (IStrategoTerm)termFactory.makeListCons(cool.constTypeImportOnDemandDec0, (IStrategoList)cool.constNil0);
    const98 = termFactory.makeString("'convert-coordinator-declaration'");
    const99 = termFactory.makeString("'gen-coordinator-body'");
    const100 = termFactory.makeString("'make-lock-and-unlock-methods'");
    const101 = termFactory.makeString("(..)) && this(obj)");
    constCons35 = (IStrategoTerm)termFactory.makeListCons(cool.const101, (IStrategoList)cool.constNil0);
    const102 = termFactory.makeString("execution(* ");
    constSynchronized0 = termFactory.makeAppl(transform._consSynchronized_0, NO_TERMS);
    constCons36 = (IStrategoTerm)termFactory.makeListCons(cool.constSynchronized0, (IStrategoList)cool.constNil0);
    constCons37 = (IStrategoTerm)termFactory.makeListCons(cool.constPublic0, (IStrategoList)cool.constCons36);
    const103 = termFactory.makeString("org");
    constId20 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const103});
    constPackageOrTypeName2 = termFactory.makeAppl(transform._consPackageOrTypeName_1, new IStrategoTerm[]{cool.constId20});
    const104 = termFactory.makeString("aspectj");
    constId21 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const104});
    constPackageOrTypeName3 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{cool.constPackageOrTypeName2, cool.constId21});
    const105 = termFactory.makeString("lang");
    constId22 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const105});
    constPackageOrTypeName4 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{cool.constPackageOrTypeName3, cool.constId22});
    const106 = termFactory.makeString("annotation");
    constId23 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const106});
    constPackageOrTypeName5 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{cool.constPackageOrTypeName4, cool.constId23});
    const107 = termFactory.makeString("After");
    constId24 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const107});
    constTypeName3 = termFactory.makeAppl(transform._consTypeName_2, new IStrategoTerm[]{cool.constPackageOrTypeName5, cool.constId24});
    const108 = termFactory.makeString("obj");
    constId25 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const108});
    constAmbName3 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{cool.constId25});
    const109 = termFactory.makeString("remove");
    constId26 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const109});
    const110 = termFactory.makeString("notifyAll");
    constId27 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const110});
    constMethodName4 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{cool.constId27});
    constMethod4 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName4});
    constInvoke4 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cool.constMethod4, cool.constNil0});
    constExprStm0 = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{cool.constInvoke4});
    constCons38 = (IStrategoTerm)termFactory.makeListCons(cool.constExprStm0, (IStrategoList)cool.constNil0);
    const111 = termFactory.makeString("'make-unlock-method'");
    const112 = termFactory.makeString("unlock_");
    const113 = termFactory.makeString("COOLMutexLocation");
    const114 = termFactory.makeString("COOLSelfexLocation");
    constMethodName5 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{cool.constId0});
    constMethod5 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName5});
    const115 = termFactory.makeString("COOLAdditionsLocation");
    const116 = termFactory.makeString("wait");
    constId28 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const116});
    constMethodName6 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{cool.constId28});
    constMethod6 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{cool.constMethodName6});
    constInvoke5 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{cool.constMethod6, cool.constNil0});
    constExprStm1 = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{cool.constInvoke5});
    constCons39 = (IStrategoTerm)termFactory.makeListCons(cool.constExprStm1, (IStrategoList)cool.constNil0);
    constBlock1 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{cool.constCons39});
    const117 = termFactory.makeString("InterruptedException");
    constId29 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const117});
    constTypeName4 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId29});
    constClassOrInterfaceType2 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cool.constTypeName4, cool.constNone0});
    const118 = termFactory.makeString("e");
    constId30 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const118});
    constParam1 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, cool.constClassOrInterfaceType2, cool.constId30});
    const119 = termFactory.makeString("RuntimeException");
    constId31 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const119});
    constTypeName5 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{cool.constId31});
    constClassOrInterfaceType3 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{cool.constTypeName5, cool.constNone0});
    constNewInstance1 = termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{cool.constNone0, cool.constClassOrInterfaceType3, cool.constNil0, cool.constNone0});
    constThrow0 = termFactory.makeAppl(transform._consThrow_1, new IStrategoTerm[]{cool.constNewInstance1});
    constCons40 = (IStrategoTerm)termFactory.makeListCons(cool.constThrow0, (IStrategoList)cool.constNil0);
    constBlock2 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{cool.constCons40});
    constCatch0 = termFactory.makeAppl(transform._consCatch_2, new IStrategoTerm[]{cool.constParam1, cool.constBlock2});
    constCons41 = (IStrategoTerm)termFactory.makeListCons(cool.constCatch0, (IStrategoList)cool.constNil0);
    constTry0 = termFactory.makeAppl(transform._consTry_2, new IStrategoTerm[]{cool.constBlock1, cool.constCons41});
    constCons42 = (IStrategoTerm)termFactory.makeListCons(cool.constTry0, (IStrategoList)cool.constNil0);
    const120 = termFactory.makeString("add");
    constId32 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const120});
    const121 = termFactory.makeString("Before");
    constId33 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{cool.const121});
    constTypeName6 = termFactory.makeAppl(transform._consTypeName_2, new IStrategoTerm[]{cool.constPackageOrTypeName5, cool.constId33});
    const122 = termFactory.makeString("'make-lock-method'");
    const123 = termFactory.makeString("lock_");
    const124 = termFactory.makeString("'fillMethodMaps'");
    const125 = termFactory.makeString("'add-condition-fields'");
    const126 = termFactory.makeString("'add-coordinator-fields'");
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}