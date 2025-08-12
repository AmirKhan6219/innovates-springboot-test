package com.innoventes.test.app.service;

import java.util.List;

import com.innoventes.test.app.entity.Company;
import com.innoventes.test.app.exception.ValidationException;

public interface CompanyService {

	List<Company> getAllCompanies();
	Company getCompanyById(Long id);

	Company getCompanyByCode(String companyCode);

	Company addCompany(Company company) throws ValidationException;

	Company updateCompany(Long id, Company company) throws ValidationException;

	Company updateCompanyPartially(Long id, Company company);
	
	void deleteCompany(Long id);
}