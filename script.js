let balance = 5000;
const modalOverlay = document.getElementById('modalOverlay');
const modalTitle = document.getElementById('modalTitle');
const modalContent = document.getElementById('modalContent');
const closeModal = document.getElementById('closeModal');

function openModal(title, content) {
  modalTitle.textContent = title;
  modalContent.innerHTML = content;
  modalOverlay.classList.add('show');
}

function closePopup() {
  modalOverlay.classList.remove('show');
}

function formatCurrency(value) {
  return `$${value.toLocaleString()}`;
}

document.querySelectorAll('.feature-card').forEach((card) => {
  card.addEventListener('click', () => {
    const action = card.dataset.action;

    if (action === 'checkbalance') {
      openModal('Check Balance', `<div class="result-box"><p>Your current balance is <strong>${formatCurrency(balance)}</strong>.</p></div>`);
    }

    if (action === 'deposit') {
      openModal('Deposit Money', `
        <label for="amount">Enter amount</label>
        <input id="amount" type="number" min="1" step="1" />
        <button type="button" class="submit-btn" id="submitAction">Submit</button>
        <div class="result-box" id="resultBox">Enter an amount to deposit.</div>
      `);

      document.getElementById('submitAction').addEventListener('click', () => {
        const deposit = Number(document.getElementById('amount').value);
        const resultBox = document.getElementById('resultBox');

        if (deposit >= 100) {
          balance += deposit;
          resultBox.innerHTML = `<p>Transaction Successful. New balance is <strong>${formatCurrency(balance)}</strong>.</p>`;
        } else {
          resultBox.innerHTML = '<p>Enter valid amount. Minimum deposit is 100.</p>';
        }
      });
    }

    if (action === 'widraw') {
      openModal('Widraw Money', `
        <label for="amount">Enter amount</label>
        <input id="amount" type="number" min="1" step="1" />
        <button type="button" class="submit-btn" id="submitAction">Submit</button>
        <div class="result-box" id="resultBox">Enter an amount to withdraw.</div>
      `);

      document.getElementById('submitAction').addEventListener('click', () => {
        const withdrawal = Number(document.getElementById('amount').value);
        const resultBox = document.getElementById('resultBox');

        if (withdrawal > balance) {
          resultBox.innerHTML = '<p>Insufficient Funds.</p>';
        } else {
          balance -= withdrawal;
          resultBox.innerHTML = `<p>Transaction Successful. New balance is <strong>${formatCurrency(balance)}</strong>.</p>`;
        }
      });
    }

    if (action === 'exit') {
      openModal('Exit', '<div class="result-box"><p>Thank you for using the banking app.</p></div>');
    }
  });
});

closeModal.addEventListener('click', closePopup);
modalOverlay.addEventListener('click', (event) => {
  if (event.target === modalOverlay) {
    closePopup();
  }
});

document.addEventListener('keydown', (event) => {
  if (event.key === 'Escape') {
    closePopup();
  }
});
