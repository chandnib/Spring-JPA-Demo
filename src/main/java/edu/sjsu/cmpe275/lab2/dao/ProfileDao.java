package edu.sjsu.cmpe275.lab2.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import edu.sjsu.cmpe275.lab2.model.Profile;


public interface ProfileDao
{
	  public void add(Profile prof);
}
