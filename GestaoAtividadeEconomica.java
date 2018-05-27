import java.util.Map;
import java.util.EnumMap;
import javafx.util.Pair;
import java.lang.Object;

public class  GestaoAtividadeEconomica
{
    /** Variáveis de Instância. */
   public enum AtividadeEconomica{
       Saude,
       Educacao,
       DespesasGerais,
       Habitacao,
       Lares,
       ReparacaoAutomovel,
       RestauraçãoAlojamento,
       CabeleireirosInstitutosBeleza,
       AtividadesVeterinarias,
       PassesMensais
   }
   
   public enum Regiao{
       EntreDouroMinho,
       TrasoMontesAltoDouro,
       BeiraLitoral,
       BeiraInterior,
       EstramaduraRibatejo,
       LisboaSetubal,
       Alentejo,
       Algarve,
       Madeira,
       Acores
   }
   
   public static EnumMap<Regiao,Double> EnumEmpresaMap;
   public static EnumMap<AtividadeEconomica,Pair<Double,Integer>> EnumPrivadaMap;
   /** Construtor vazio da classe GestaoAtividadeEconomica. */
   public GestaoAtividadeEconomica(){
       EnumEmpresaMap = new EnumMap<Regiao,Double>(Regiao.class);
       EnumEmpresaMap.put(Regiao.EntreDouroMinho, 0.23);
       EnumEmpresaMap.put(Regiao.TrasoMontesAltoDouro, 0.05);
       EnumEmpresaMap.put(Regiao.BeiraLitoral, 0.23);
       EnumEmpresaMap.put(Regiao.BeiraInterior, 0.04);
       EnumEmpresaMap.put(Regiao.EstramaduraRibatejo, 0.22);
       EnumEmpresaMap.put(Regiao.LisboaSetubal, 0.23);
       EnumEmpresaMap.put(Regiao.Alentejo, 0.04);
       EnumEmpresaMap.put(Regiao.Algarve, 0.23);
       EnumEmpresaMap.put(Regiao.Madeira, 0.23);
       EnumEmpresaMap.put(Regiao.Acores, 0.20);
       
       EnumPrivadaMap = new EnumMap<AtividadeEconomica,Pair<Double,Integer>>(AtividadeEconomica.class);
       Pair Saude = new Pair<Double,Integer>(0.12,1000001);
       Pair Educacao = new Pair<Double,Integer>(0.05,1000002);
       Pair DespesasGerais = new Pair<Double,Integer>(0.22,1000003);
       Pair Habitacao = new Pair<Double,Integer>(0.18,1000004);
       Pair Lares = new Pair<Double,Integer>(0.18,1000005);
       Pair ReparacaoAutomovel = new Pair<Double,Integer>(0.15,1000006);
       Pair RestauracaoAlojamento = new Pair<Double,Integer>(0.20,1000007);
       Pair CabeleireirosInstitutosBeleza = new Pair<Double,Integer>(0.0,1000008);
       Pair AtividadesVeterinarias = new Pair<Double,Integer>(0.03,1000009);
       Pair PassesMensais = new Pair<Double,Integer>(0.0,1000010);
       
       EnumPrivadaMap.put(AtividadeEconomica.Saude, Saude);
       EnumPrivadaMap.put(AtividadeEconomica.Educacao, Educacao);
       EnumPrivadaMap.put(AtividadeEconomica.DespesasGerais, DespesasGerais);
       EnumPrivadaMap.put(AtividadeEconomica.Habitacao, Habitacao);
       EnumPrivadaMap.put(AtividadeEconomica.Lares, Lares);
       EnumPrivadaMap.put(AtividadeEconomica.ReparacaoAutomovel, ReparacaoAutomovel);
       EnumPrivadaMap.put(AtividadeEconomica.RestauraçãoAlojamento, RestauracaoAlojamento);
       EnumPrivadaMap.put(AtividadeEconomica.CabeleireirosInstitutosBeleza, CabeleireirosInstitutosBeleza);
       EnumPrivadaMap.put(AtividadeEconomica.AtividadesVeterinarias, AtividadesVeterinarias);
       EnumPrivadaMap.put(AtividadeEconomica.PassesMensais, PassesMensais);
   }
   
       /** Get EnumEmpresaMap da GestaoAtividadeEconomica
      * @return EnumEmpresaMap da GestaoAtividadeEconomica.
      */
   public static EnumMap<Regiao,Double> getEnumEmpresaMap(){
       return EnumEmpresaMap;
    }
    
        /** Get getEnumPrivadaMap da GestaoAtividadeEconomica
      * @return getEnumPrivadaMap da GestaoAtividadeEconomica.
      */
   public static EnumMap<AtividadeEconomica,Pair<Double,Integer>> getEnumPrivadaMap(){
       return EnumPrivadaMap;
    }
   
}

