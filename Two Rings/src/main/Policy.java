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
    public String aboutUs = "Welcome to Two Rings, your trusted online platform for seamless and memorable marriage registration experiences.\n At Two Rings, "
            + "we understand that the journey to marriage is a special and significant chapter in your life.\n"
            + " Our mission is to simplify the marriage registration process, ensuring it's not only a legal formality but also a celebration of love and commitment.\n" +
"\n" +
"Who We Are:\n" +
"Two Rings was founded with a vision to provide couples with a modern, \nefficient, and user-friendly platform for marriage registration. \nOur team is passionate about celebrating love in all its forms and is committed to making the \nlegal aspect of marriage as smooth and stress-free as possible.\n" +
"\n" +
"What Sets Us Apart:\n" +
"\n" +
"Simplicity: We believe in keeping things simple. Our user-friendly interface guides you through the registration process step by step, ensuring clarity and ease of use.\n" +
"\n" +
"Efficiency: Time is precious, especially when it comes to your special day. Two Rings streamlines the marriage registration process, saving you time and effort.\n" +
"\n" +
"Security and Privacy: Your privacy is our priority. We employ state-of-the-art security measures to safeguard your personal information, making your registration experience worry-free.\n" +
"\n" +
"Customer-Centric Approach: Our dedicated support team is here to assist you at every stage. Whether you have questions\n about documentation or need guidance on the process, we're just a message away.\n" +
"\n" +
"Our Services:\n" +
"\n" +
"Online Registration: Register your marriage from the comfort of your home, eliminating the need for lengthy visits to government offices.\n" +
"\n" +
"Documentation Assistance: We guide you through the required documents, ensuring you have everything you need for a smooth registration.\n" +
"\n" +
"Expert Advice: Our team of experts is well-versed in marriage laws and regulations, ready to provide you with accurate information and advice.\n" +
"\n" +
"Why Choose Two Rings:\n" +
"\n" +
"Reliability: Trust Two Rings to handle your marriage registration with precision and reliability.\n" +
"\n" +
"Celebrating Love: We believe that the legalities of marriage should not overshadow the joy of the \ncommitment you're making. Two Rings allows you to celebrate your love while fulfilling legal requirements.\n" +
"\n" +
"Innovation: We stay updated with the latest technology to bring you an innovative and modern marriage registration experience.\n" +
"\n" +
"Thank you for choosing Two Rings as your partner on this incredible journey. Let's make your marriage registration as memorable as your love story.";
    

    public Policy(String policy) {
        this.policy = policy;
    }

    public Policy() {
    }
    
    

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
