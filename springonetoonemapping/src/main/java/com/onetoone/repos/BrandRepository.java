package com.onetoone.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.onetoone.entity.Brand;
@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

}
