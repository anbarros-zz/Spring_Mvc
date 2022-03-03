package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.controller.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido =  new Pedido();
		pedido.setNomeProduto("Novos Echo Buds (2ª Geração):");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/6147ZT4PeFL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/dp/B085WTR4CP/?pf_rd_r=9RMCAGZGATCQE2AC1FSR&pf_rd_p=21f89736-489e-403e-99be-6c73c9d9c942&pd_rd_r=598bbacf-db67-40ae-81b2-4b4a1f6ac84e&pd_rd_w=S1yOt&pd_rd_wg=agFfO&ref_=pd_gw_unk");
		pedido.setDescricao("Melhor fone sem fio");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos",pedidos);
		return "home";
	}

}
