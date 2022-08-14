package com.system.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.system.api.model.ClientCode;
import com.system.api.payload.ServerResponse;
import com.system.api.service.SystemServiceImpl;



@RestController
@RequestMapping(value = "/system")
@CrossOrigin(origins = "http://localhost:3000")
public class ClientController {

	@Autowired
	SystemServiceImpl systemservice;
	
	@PostMapping(value = "/AddClientCode")
	public ServerResponse AddClientCode(@RequestBody ClientCode client_code) {

		ClientCode dbFile = systemservice.AddClientCode(client_code);
		return new ServerResponse(dbFile.getCode(), client_code.getBrief_desc());
	}

	@GetMapping(value = "/getuserClientCodebyUid/{id}") // pathvariable
	public List<ClientCode> getuserClientCodebyUid(@PathVariable("id") Integer id) {
		// System.out.println(prodName);
		return systemservice.getuserClientCodebyUid(id);
	}

	@PostMapping(value = "/UpdateClientCodebyUid")
	public void UpdateClientCodebyUid(@RequestParam("id") Integer id,
			@RequestParam("brief_desc")String brief_desc, 
			@RequestParam("expl_desc")String expl_desc, 
			@RequestParam("final_session")String final_session,
			@RequestParam("m_desc")String m_desc, 
			@RequestParam("redirect_to_supplier_state")String redirect_to_supplier_state) {
		systemservice.UpdateClientCodebyUid(id,brief_desc,expl_desc,final_session,m_desc,redirect_to_supplier_state);
	}

	@DeleteMapping("/deleteClientCode/{id}")
	public void deleteClientCode(@PathVariable("id") int id) {
		systemservice.deleteClientCode(id);
	}


	
}
