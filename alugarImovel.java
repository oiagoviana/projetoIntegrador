import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


	
	
	public record alugarImovel (
	        int codigo,
	        String nomePeca,
	        String nomeComprador,
	        int quantidade,
	        LocalDateTime hora,
	        BigDecimal preco
	) {
    
    public static void main(String[] args) {
        alugarImovel();
    }

    public static void alugarImovel(){
    	
    }
}