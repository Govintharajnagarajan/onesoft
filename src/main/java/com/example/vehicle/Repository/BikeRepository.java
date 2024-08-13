package com.example.vehicle.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.vehicle.Entity.Bike;

public interface BikeRepository extends JpaRepository<Bike,Integer>{
@Query(value="select * from Bike order by price desc limit 3,1",nativeQuery=true)
public Bike getfourthmax();
	
	
@Query(value="select avg(b.price) from Bike b  ")	
public Float getaverage();

@Query(value="select * from bike order by color,price;",nativeQuery=true)
public List<Bike> getsorted();


@Query(value="select *from bike where price>(select avg(price) from bike)",nativeQuery=true)
public List<Bike> getaveragemax();


@Query(value="select b from Bike b order by b.price limit 3")
public List<Bike> getmax3();


@Query(value="select b from Bike b where b.price>(50000) order by b.color")
public List<Bike> getsortcolor();


@Query(value="select  sum(b.price) from Bike b",nativeQuery=true)
public int getsum();


@Query(value="select round(avg(price),2) from bike",nativeQuery=true)
public double getdecimal();
}
