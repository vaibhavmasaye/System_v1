package com.system.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client_code")
public class ClientCode {

	@Id
    @Column(name = "code")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer code ;
	
	@Column(name = "brief_desc")
	private String brief_desc;
	
	
	@Column(name = "expl_desc")
	private String expl_desc;
	
	@Column(name = "final_session")
	private String final_session;
	
	@Column(name = "m_desc")
	private String m_desc;
	
	@Column(name = "redirect_to_supplier_state")
	private String redirect_to_supplier_state;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getBrief_desc() {
		return brief_desc;
	}

	public void setBrief_desc(String brief_desc) {
		this.brief_desc = brief_desc;
	}

	public String getExpl_desc() {
		return expl_desc;
	}

	public void setExpl_desc(String expl_desc) {
		this.expl_desc = expl_desc;
	}

	public String getFinal_session() {
		return final_session;
	}

	public void setFinal_session(String final_session) {
		this.final_session = final_session;
	}

	public String getM_desc() {
		return m_desc;
	}

	public void setM_desc(String m_desc) {
		this.m_desc = m_desc;
	}

	public String getRedirect_to_supplier_state() {
		return redirect_to_supplier_state;
	}

	public void setRedirect_to_supplier_state(String redirect_to_supplier_state) {
		this.redirect_to_supplier_state = redirect_to_supplier_state;
	}

	@Override
	public String toString() {
		return "ClientCode [code=" + code + ", brief_desc=" + brief_desc + ", expl_desc=" + expl_desc
				+ ", final_session=" + final_session + ", m_desc=" + m_desc + ", redirect_to_supplier_state="
				+ redirect_to_supplier_state + ", getCode()=" + getCode() + ", getBrief_desc()=" + getBrief_desc()
				+ ", getExpl_desc()=" + getExpl_desc() + ", getFinal_session()=" + getFinal_session() + ", getM_desc()="
				+ getM_desc() + ", getRedirect_to_supplier_state()=" + getRedirect_to_supplier_state() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public ClientCode(Integer code, String brief_desc, String expl_desc, String final_session, String m_desc,
			String redirect_to_supplier_state) {
		super();
		this.code = code;
		this.brief_desc = brief_desc;
		this.expl_desc = expl_desc;
		this.final_session = final_session;
		this.m_desc = m_desc;
		this.redirect_to_supplier_state = redirect_to_supplier_state;
	}

	public ClientCode() {
		super();
	}

		
	
}

