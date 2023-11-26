/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author acer
 */
public class Policy {
    
    public String policy;
    public String aboutUs;

    public Policy(String policy, String aboutUs) {
        this.policy = policy;
        this.aboutUs = aboutUs;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs;
    }

    @Override
    public String toString() {
        return "Policy{" + "policy=" + policy +
                ", aboutUs=" + aboutUs + '}';
    }
    
    
    
}
