# Personalized Content Generation for Bank of Baroda Hackathon 2024

## Team: Coach_Sahab
"Driving the technology through the leaps of Himalayas"

## Project Overview
This project aims to solve the problem of personalized content generation for the banking sector, enhancing customer satisfaction and engagement through tailored content. Our solution leverages advanced AI and machine learning models to deliver personalized marketing materials, financial reports, and educational content.

## Screenshots 

<table>
  <tr>
    <td>
      <img src="https://github.com/user-attachments/assets/ea56b505-968e-4976-b5ba-1391e4cb6f76" alt="Financial Advisor" width="300"/>
      <br />
      <strong>Financial Advisor</strong>
    </td>
    <td>
      <img src="https://github.com/user-attachments/assets/46baf0d7-5964-40d1-9fdb-9e0a63fd64de" alt="Dashboard Home Screen" width="300"/>
      <br />
      <strong>Dashboard Home Screen</strong>
    </td>
    <td>
      <img src="https://github.com/user-attachments/assets/d79eea6e-f9c8-4721-96fa-f49f6d6c0280" alt="Graph and Goals" width="300"/>
      <br />
      <strong>Graph and Goals</strong>
    </td>
  </tr>
  <tr>
    <td>
      <img src="https://github.com/user-attachments/assets/25baa61b-5bb2-4655-8f24-ed5eb03c607e" alt="AI Prompts 1" width="300"/>
      <br />
      <strong>AI Prompts 1</strong>
    </td>
    <td>
      <img src="https://github.com/user-attachments/assets/6116f091-8e8a-40a2-9a3b-799c6c34da1e" alt="AI Prompts 2" width="300"/>
      <br />
      <strong>AI Prompts 2</strong>
    </td>
    <td>
      <img src="https://github.com/user-attachments/assets/8a37d73b-e561-479e-bcdf-52c8e76944e8" alt="Transaction" width="300"/>
      <br />
      <strong>Transaction</strong>
    </td>
  </tr>
  <tr>
    <td>
      <img src="https://github.com/user-attachments/assets/398afb99-85bf-458d-a666-4286b907319d" alt="Transaction Screen" width="300"/>
      <br />
      <strong>Transaction Screen</strong>
    </td>
    <td>
      <img src="https://github.com/user-attachments/assets/5113e213-693f-4f50-934b-eb7958e29f28" alt="Profile Screen" width="300"/>
      <br />
      <strong>Profile Screen</strong>
    </td>
    <td>
      <img src="https://github.com/user-attachments/assets/5ed13bae-3660-430c-b9d8-725617c41233" alt="Financial Report" width="300"/>
      <br />
      <strong>Financial Report</strong>
    </td>
  </tr>
  <tr>
    <td>
      <img src="https://github.com/user-attachments/assets/2cb8f196-ae9f-4287-a2ef-490b594a26e2" alt="Login Screen" width="300"/>
      <br />
      <strong>Login Screen</strong>
    </td>
    <td>
      <img src="https://github.com/user-attachments/assets/7e47287f-0ebf-493e-a0dd-df83cdcf6a8f" alt="Splash Screen" width="300"/>
      <br />
      <strong>Splash Screen</strong>
    </td>
  </tr>
</table>



## Repository
Android Code Branch Link: [SmartBaroda](https://github.com/uphargaur/SmartBaroda)
GenAI Backend Branch : [GenAI Services](https://github.com/kamalyash2002/SmartBaroda/tree/final-genAI)
Core Backend Branch : [Core Server](https://github.com/kamalyash2002/SmartBaroda/tree/final-submission/server)


## Architecture

### Overall Architecture
1. **Data Ingestion Layer**
   - **Components**: Azure Data Factory, Azure Data Lake Storage
   - **Function**: Collects and processes customer data from multiple sources, ensuring data quality and consistency.

2. **AI Model Layer**
   - **Components**: Azure Machine Learning, Azure Kubernetes Service (AKS), Azure Batch
   - **Function**: Utilizes AI models to generate personalized content based on customer data analysis.

3. **Distribution Layer**
   - **Components**: Azure API Management, Azure Functions, Azure Logic Apps
   - **Function**: Distributes personalized content through appropriate channels (email, SMS, mobile app).

4. **Feedback Loop**
   - **Components**: Azure Application Insights, Power BI
   - **Function**: Gathers feedback on content effectiveness to refine and improve personalization algorithms.

### Backend Architecture
1. **Source Code Management**
   - **Tools**: GitHub, Jenkins/GitHub Actions
   - **Function**: Version control, continuous integration, and deployment.

2. **Deployment**
   - **Components**: Cloud-based virtual machines, Docker
   - **Function**: Hosting the application and running it in containers.

3. **AI System**
   - **Components**: AI models for processing complex queries
   - **Function**: Provide advanced functionalities.

4. **API**
   - **Function**: Interfaces for communication between software components, handling client requests.

5. **Database Management**
   - **Components**: MongoDB
   - **Function**: Storing and retrieving application data efficiently.

### Generative AI Architecture
1. **Langchain Agent**
   - **Function**: Uses a language model to choose a sequence of actions to take.

2. **Langchain Tools**
   - **Function**: Interfaces that the agent can use to interact with the world.

3. **OpenAI LLM (Azure)**
   - **Components**: OpenAI ChatGPT 3.5/4.0, Langchain Framework
   - **Function**: Generative AI for creating personalized content.

### Frontend Architecture
1. **Retrofit Service**
   - **Function**: Simplifies network operations, manages API calls, and converts responses into data models.

2. **DI Class for Dagger**
   - **Function**: Manages dependencies, ensuring clean and reusable components.

3. **ViewModel**
   - **Function**: Manages UI data and business logic.

4. **Repository**
   - **Function**: Provides a single source of truth for data, handles caching and synchronization.

5. **Activity/Fragment**
   - **Function**: Displays data, handles user interactions, and delegates logic to ViewModel.

## Azure Resources Required
- **Azure Machine Learning**: For the entire machine learning lifecycle.
- **Azure AI Studio & Azure OpenAI**: For advanced language models.
- **Azure Virtual Machines**: For scalable computing power.
- **Azure Kubernetes Service (AKS)**: For managing data processing nodes.
- **Azure Data Lake Storage**: For scalable data storage.
- **Azure Logic Apps**: For workflow automation.
- **Azure Application Insights**: For monitoring and feedback.

## Methodology
1. **Pilot Testing**
2. **Feedback and Refinement**
3. **Gradual Rollout**
4. **Marketing and Awareness Campaigns**
5. **Customer Support and Training**
6. **Continuous Improvement**

## Key Differentiators
- **Highly Personalized Content**
- **Real-Time Content Generation**
- **Comprehensive Integration**
- **Data-Driven Insights**
- **Continuous Improvement**

## Adoption Plan
1. **Pilot Testing**
2. **Feedback and Refinement**
3. **Gradual Rollout**
4. **Marketing and Awareness Campaigns**
5. **Customer Support and Training**
6. **Continuous Improvement**

## Scalability
- **Cloud Infrastructure**
- **Microservices Architecture**
- **AI Model Deployment**
- **Data Processing Efficiency**
- **Distribution Channels**
- **Continuous Monitoring and Optimization**

## Security Considerations
- **Data Encryption**
- **Access Control**
- **Compliance Certifications**
- **Network Security**
- **Threat Detection**
- **Data Residency**
- **Audits and Assessments**
- **Disaster Recovery**

## Android App Releases

### Version History

#### v1.0.0 - July 31, 2024
- Initial release with core features
- Includes functionalities like user registration, login, GenAI Features etc.


## Contributors
- Yash Kamal Saxena
- Tushar Garg
- Uphar Gaur

Thank you for considering our project!
