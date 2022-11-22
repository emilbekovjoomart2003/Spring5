package peaksoft.repository.impl;

import org.springframework.stereotype.Repository;
import peaksoft.entity.Company;
import peaksoft.repository.CompanyRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CompanyRepositoryImpl implements CompanyRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Company> getAllCompany() {
        return entityManager.createQuery("select c from Company c",Company.class).getResultList();
    }
}
