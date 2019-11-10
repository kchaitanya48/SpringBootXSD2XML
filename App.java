package com.sample;

public class App {/*
	
	
	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		

		
		try
        {
			
			CourseResponse resp=new CourseResponse();
			
			 Class<?> animalClass = Class.forName("com.xyz.test.CourseResponse");
			    Field[] fields = animalClass.getDeclaredFields();
			    for(Field f1:fields) {
			    	System.out.println(f1.getName() +"  "+f1.getModifiers()+" "+f1.getType());
			    }
			    for(Field f:fields) {
			    	f.setAccessible(true);
			    	if(f.getName()!="serialVersionUID") {
			    	if(f.getType().equals(String.class)) {
			    		f.set(resp," ");
			    	}
			    		
			    	}
			    	
			    }
			
			

            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(CourseResponse.class);
             
            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
 
            //Print XML String to Console
            StringWriter sw = new StringWriter();
            JAXBElement<CourseResponse> jaxbElement 
            = new JAXBElement<CourseResponse>( new QName("", "courseResponse"), CourseResponse.class, resp );
            //Write XML to StringWriter
            jaxbMarshaller.marshal(jaxbElement, sw);
             
            //Verify XML Content
            String xmlContent = sw.toString();
            System.out.println( xmlContent );
 
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	
	
*/}
