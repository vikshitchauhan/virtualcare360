window.onload = function () {
    // Toggle buttons for switching forms
    const container = document.getElementById("container");
    const registerBtn = document.getElementById("register");
    const loginBtn = document.getElementById("login");
    const signUpBtn = document.getElementById("signUpBtn");
    const signInBtn = document.getElementById("signInBtn");
  
    registerBtn.addEventListener("click", () => {
      container.classList.add("active");
  
      // Change button color to match toggle background (marine teal)
      if (signUpBtn) {
        signUpBtn.style.backgroundColor = "#4C6B73";
        signUpBtn.style.color = "#fff";
      }
    });
  
    loginBtn.addEventListener("click", () => {
      container.classList.remove("active");
  
      // Change button color back to default brown
      if (signInBtn) {
        signInBtn.style.backgroundColor = "#8B4513";
        signInBtn.style.color = "#fff";
      }
    });
  
    // Random hospital quote
    const quotes = [
      "स्वस्थ शरीर में ही स्वस्थ मन का वास होता है।",
      "सेवा ही सच्चा धर्म है – यही अस्पताल की पहचान है।",
      "हर मुस्कान के पीछे एक डॉक्टर की मेहनत होती है।",
      "जहाँ उम्मीद टूटती है, वहीं अस्पताल एक नई उम्मीद जगाता है।",
      "अस्पताल एक मंदिर है, जहाँ जीवन को नया रूप मिलता है।",
    ];
  
    const quoteElement = document.getElementById("hospitalQuote");
    if (quoteElement) {
      const randomIndex = Math.floor(Math.random() * quotes.length);
      quoteElement.textContent = quotes[randomIndex];
    }
  };
  