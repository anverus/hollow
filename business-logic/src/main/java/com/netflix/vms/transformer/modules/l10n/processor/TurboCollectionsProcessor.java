package com.netflix.vms.transformer.modules.l10n.processor;

import com.netflix.hollow.core.write.objectmapper.HollowObjectMapper;
import com.netflix.vms.transformer.common.TransformerContext;
import com.netflix.vms.transformer.hollowinput.TranslatedTextHollow;
import com.netflix.vms.transformer.hollowinput.TurboCollectionsHollow;
import com.netflix.vms.transformer.hollowinput.VMSHollowInputAPI;
import com.netflix.vms.transformer.modules.l10n.L10nResourceIdLookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TurboCollectionsProcessor extends AbstractL10NMiscProcessor<TurboCollectionsHollow> {

    public TurboCollectionsProcessor(VMSHollowInputAPI api, TransformerContext ctx, HollowObjectMapper mapper) {
        super(api, ctx, mapper);
    }

    @Override
    public Collection<TurboCollectionsHollow> getInputs() {
        return api.getAllTurboCollectionsHollow();
    }

    @Override
    public void processInput(TurboCollectionsHollow input) {
        final int inputId = (int) input._getId();
        final String prefix = input._getPrefix()._getValue();

        Map<String, TranslatedTextHollow> map = new HashMap<>();
        map.put("bmt.n", input._getBmt_n());
        map.put("char.n", input._getChar_n());
        map.put("dn", input._getDn());
        map.put("kc.cn", input._getKc_cn());
        map.put("kag.kn", input._getKag_kn());
        map.put("nav.sn", input._getNav_sn());
        map.put("roar.n", input._getRoar_n());
        map.put("sn", input._getSn());
        map.put("st.0", input._getSt_0());
        map.put("st.1", input._getSt_1());
        map.put("st.2", input._getSt_2());
        map.put("st.3", input._getSt_3());
        map.put("st.4", input._getSt_4());
        map.put("st.5", input._getSt_5());
        map.put("st.6", input._getSt_6());
        map.put("st.7", input._getSt_7());
        map.put("st.8", input._getSt_8());
        map.put("st.9", input._getSt_9());
        map.put("tdn", input._getTdn());
        map.put("des", input._getDes());
        map.put("evi.n", input._getEvi_n());
        map.put("seorbt", input._getSeorbt());
        map.put("seogh", input._getSeogh());
        map.put("seodt", input._getSeodt());

        map.put("st.10", input._getSt_10());
        map.put("st.11", input._getSt_11());
        map.put("st.12", input._getSt_12());
        map.put("st.13", input._getSt_13());
        map.put("st.14", input._getSt_14());
        map.put("st.15", input._getSt_15());
        map.put("st.16", input._getSt_16());
        map.put("st.17", input._getSt_17());
        map.put("st.18", input._getSt_18());
        map.put("st.19", input._getSt_19());
        map.put("st.20", input._getSt_20());
        map.put("st.21", input._getSt_21());
        map.put("st.22", input._getSt_22());
        map.put("st.23", input._getSt_23());
        map.put("st.24", input._getSt_24());
        map.put("st.25", input._getSt_25());
        map.put("st.26", input._getSt_26());
        map.put("st.27", input._getSt_27());
        map.put("st.28", input._getSt_28());
        map.put("st.29", input._getSt_29());
        map.put("st.30", input._getSt_30());
        map.put("st.31", input._getSt_31());
        map.put("st.32", input._getSt_32());
        map.put("st.33", input._getSt_33());
        map.put("st.34", input._getSt_34());
        map.put("st.35", input._getSt_35());
        map.put("st.36", input._getSt_36());
        map.put("st.37", input._getSt_37());
        map.put("st.38", input._getSt_38());
        map.put("st.39", input._getSt_39());
        map.put("st.40", input._getSt_40());
        map.put("st.41", input._getSt_41());
        map.put("st.42", input._getSt_42());
        map.put("st.43", input._getSt_43());
        map.put("st.44", input._getSt_44());
        map.put("st.45", input._getSt_45());
        map.put("st.46", input._getSt_46());
        map.put("st.47", input._getSt_47());
        map.put("st.48", input._getSt_48());
        map.put("st.49", input._getSt_49());
        map.put("st.50", input._getSt_50());
        map.put("st.51", input._getSt_51());
        map.put("st.52", input._getSt_52());
        map.put("st.53", input._getSt_53());
        map.put("st.54", input._getSt_54());
        map.put("st.55", input._getSt_55());
        map.put("st.56", input._getSt_56());
        map.put("st.57", input._getSt_57());
        map.put("st.58", input._getSt_58());
        map.put("st.59", input._getSt_59());
        map.put("st.60", input._getSt_60());
        map.put("st.61", input._getSt_61());
        map.put("st.62", input._getSt_62());
        map.put("st.63", input._getSt_63());
        map.put("st.64", input._getSt_64());
        map.put("st.65", input._getSt_65());
        map.put("st.66", input._getSt_66());
        map.put("st.67", input._getSt_67());
        map.put("st.68", input._getSt_68());
        map.put("st.69", input._getSt_69());
        map.put("st.70", input._getSt_70());
        map.put("st.71", input._getSt_71());
        map.put("st.72", input._getSt_72());
        map.put("st.73", input._getSt_73());
        map.put("st.74", input._getSt_74());
        map.put("st.75", input._getSt_75());
        map.put("st.76", input._getSt_76());
        map.put("st.77", input._getSt_77());
        map.put("st.78", input._getSt_78());
        map.put("st.79", input._getSt_79());
        map.put("st.80", input._getSt_80());
        map.put("st.81", input._getSt_81());
        map.put("st.82", input._getSt_82());
        map.put("st.83", input._getSt_83());
        map.put("st.84", input._getSt_84());
        map.put("st.85", input._getSt_85());
        map.put("st.86", input._getSt_86());
        map.put("st.87", input._getSt_87());
        map.put("st.88", input._getSt_88());
        map.put("st.89", input._getSt_89());
        map.put("st.90", input._getSt_90());
        map.put("st.91", input._getSt_91());
        map.put("st.92", input._getSt_92());
        map.put("st.93", input._getSt_93());
        map.put("st.94", input._getSt_94());
        map.put("st.95", input._getSt_95());
        map.put("st.96", input._getSt_96());
        map.put("st.97", input._getSt_97());
        map.put("st.98", input._getSt_98());
        map.put("st.99", input._getSt_99());
        map.put("st.100", input._getSt_100());
        map.put("st.101", input._getSt_101());
        map.put("st.102", input._getSt_102());
        map.put("st.103", input._getSt_103());
        map.put("st.104", input._getSt_104());
        map.put("st.105", input._getSt_105());
        map.put("st.106", input._getSt_106());
        map.put("st.107", input._getSt_107());
        map.put("st.108", input._getSt_108());
        map.put("st.109", input._getSt_109());
        map.put("st.110", input._getSt_110());
        map.put("st.111", input._getSt_111());
        map.put("st.112", input._getSt_112());
        map.put("st.113", input._getSt_113());
        map.put("st.114", input._getSt_114());
        map.put("st.115", input._getSt_115());
        map.put("st.116", input._getSt_116());
        map.put("st.117", input._getSt_117());
        map.put("st.118", input._getSt_118());
        map.put("st.119", input._getSt_119());
        map.put("st.120", input._getSt_120());
        map.put("st.121", input._getSt_121());
        map.put("st.122", input._getSt_122());
        map.put("st.123", input._getSt_123());
        map.put("st.124", input._getSt_124());
        map.put("st.125", input._getSt_125());
        map.put("st.126", input._getSt_126());
        map.put("st.127", input._getSt_127());
        map.put("st.128", input._getSt_128());
        map.put("st.129", input._getSt_129());
        map.put("st.130", input._getSt_130());
        map.put("st.131", input._getSt_131());
        map.put("st.132", input._getSt_132());
        map.put("st.133", input._getSt_133());
        map.put("st.134", input._getSt_134());
        map.put("st.135", input._getSt_135());
        map.put("st.136", input._getSt_136());
        map.put("st.137", input._getSt_137());
        map.put("st.138", input._getSt_138());
        map.put("st.139", input._getSt_139());
        map.put("st.140", input._getSt_140());
        map.put("st.141", input._getSt_141());
        map.put("st.142", input._getSt_142());
        map.put("st.143", input._getSt_143());
        map.put("st.144", input._getSt_144());
        map.put("st.145", input._getSt_145());
        map.put("st.146", input._getSt_146());
        map.put("st.147", input._getSt_147());
        map.put("st.148", input._getSt_148());
        map.put("st.149", input._getSt_149());
        map.put("st.150", input._getSt_150());
        map.put("st.151", input._getSt_151());
        map.put("st.152", input._getSt_152());
        map.put("st.153", input._getSt_153());
        map.put("st.154", input._getSt_154());
        map.put("st.155", input._getSt_155());
        map.put("st.156", input._getSt_156());
        map.put("st.157", input._getSt_157());
        map.put("st.158", input._getSt_158());
        map.put("st.159", input._getSt_159());
        map.put("st.160", input._getSt_160());
        map.put("st.161", input._getSt_161());
        map.put("st.162", input._getSt_162());
        map.put("st.163", input._getSt_163());
        map.put("st.164", input._getSt_164());
        map.put("st.165", input._getSt_165());
        map.put("st.166", input._getSt_166());
        map.put("st.167", input._getSt_167());
        map.put("st.168", input._getSt_168());
        map.put("st.169", input._getSt_169());
        map.put("st.170", input._getSt_170());
        map.put("st.171", input._getSt_171());
        map.put("st.172", input._getSt_172());
        map.put("st.173", input._getSt_173());
        map.put("st.174", input._getSt_174());
        map.put("st.175", input._getSt_175());
        map.put("st.176", input._getSt_176());
        map.put("st.177", input._getSt_177());
        map.put("st.178", input._getSt_178());
        map.put("st.179", input._getSt_179());
        map.put("st.180", input._getSt_180());
        map.put("st.181", input._getSt_181());
        map.put("st.182", input._getSt_182());
        map.put("st.183", input._getSt_183());
        map.put("st.184", input._getSt_184());
        map.put("st.185", input._getSt_185());
        map.put("st.186", input._getSt_186());
        map.put("st.187", input._getSt_187());
        map.put("st.188", input._getSt_188());
        map.put("st.189", input._getSt_189());
        map.put("st.190", input._getSt_190());
        map.put("st.191", input._getSt_191());
        map.put("st.192", input._getSt_192());
        map.put("st.193", input._getSt_193());
        map.put("st.194", input._getSt_194());
        map.put("st.195", input._getSt_195());
        map.put("st.196", input._getSt_196());
        map.put("st.197", input._getSt_197());
        map.put("st.198", input._getSt_198());
        map.put("st.199", input._getSt_199());
        map.put("st.200", input._getSt_200());
        map.put("st.201", input._getSt_201());
        map.put("st.202", input._getSt_202());
        map.put("st.203", input._getSt_203());
        map.put("st.204", input._getSt_204());
        map.put("st.205", input._getSt_205());
        map.put("st.206", input._getSt_206());
        map.put("st.207", input._getSt_207());
        map.put("st.208", input._getSt_208());
        map.put("st.209", input._getSt_209());
        map.put("st.210", input._getSt_210());
        map.put("st.211", input._getSt_211());
        map.put("st.212", input._getSt_212());
        map.put("st.213", input._getSt_213());
        map.put("st.214", input._getSt_214());
        map.put("st.215", input._getSt_215());
        map.put("st.216", input._getSt_216());
        map.put("st.217", input._getSt_217());
        map.put("st.218", input._getSt_218());
        map.put("st.219", input._getSt_219());
        map.put("st.220", input._getSt_220());
        map.put("st.221", input._getSt_221());
        map.put("st.222", input._getSt_222());
        map.put("st.223", input._getSt_223());
        map.put("st.224", input._getSt_224());
        map.put("st.225", input._getSt_225());
        map.put("st.226", input._getSt_226());
        map.put("st.227", input._getSt_227());
        map.put("st.228", input._getSt_228());
        map.put("st.229", input._getSt_229());
        map.put("st.230", input._getSt_230());

        for (Map.Entry<String, TranslatedTextHollow> entry : map.entrySet()) {
            String key = entry.getKey();
            TranslatedTextHollow value = entry.getValue();
            if (value == null) continue;

            String resourceId = L10nResourceIdLookup.getGenericResourceId(inputId, prefix, key);
            addL10NResources(resourceId, value);
        }
    }
}