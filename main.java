import sun.swing.*;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class main extends JFrame{
    Integer internacional = 0;
    String vint = "Não";
    public main(MaskFormatter mascaracep) throws ParseException{
        super("Cadastro Fornecedor");
        Container tela = getContentPane();
        setLayout(null);

        JLabel titulo = new JLabel("Cadastro de Fornecedor");
        titulo.setForeground(new Color(48, 127, 226));
        titulo.setBounds(200,-15,250,60);
        titulo.setFont(new Font("Century Gothic",Font.BOLD,20));
        tela.add(titulo);

        JLabel forn = new JLabel("Tipo de fornecedor: *");
        forn.setForeground(new Color(255, 255, 255));
        forn.setBounds(20,20,200,60);
        forn.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(forn);

        JTextField fornecedor = new JTextField("");
        fornecedor.setBounds(200, 45, 300, 20);
        tela.add(fornecedor);

        JLabel raz = new JLabel("Razão Social: *");
        raz.setForeground(new Color(255, 255, 255));
        raz.setBounds(20,60,200,60);
        raz.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(raz);

        JTextField razao = new JTextField("");
        razao.setBounds(200, 85, 350, 20);
        tela.add(razao);

        JLabel fant = new JLabel("Nome Fantasia: ");
        fant.setForeground(new Color(255, 255, 255));
        fant.setBounds(20,100,200,60);
        fant.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(fant);

        JTextField fantasia = new JTextField("");
        fantasia.setBounds(200, 125, 350, 20);
        tela.add(fantasia);

        JLabel rotulo3 = new JLabel("CPF/CNPJ: *");
        rotulo3.setForeground(new Color(255, 255, 255));
        rotulo3.setBounds(20,140,150,60);
        rotulo3.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(rotulo3);

        MaskFormatter mascaracpf = new MaskFormatter("#########-##");
        mascaracpf.setPlaceholderCharacter('_');
        JFormattedTextField cpf = new JFormattedTextField(mascaracpf);
        cpf.setBounds(200,165,120,20);
        tela.add(cpf);

        JLabel rep = new JLabel("Representante: ");
        rep.setForeground(new Color(255, 255, 255));
        rep.setBounds(20,180,180,60);
        rep.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(rep);

        JTextField representante = new JTextField("");
        representante.setBounds(200, 205, 350, 20);
        tela.add(representante);

        JLabel end = new JLabel("Endereço: *");
        end.setForeground(new Color(255, 255, 255));
        end.setBounds(20,220,120,60);
        end.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(end);

        JTextField endereco = new JTextField("");
        endereco.setBounds(200, 245, 350, 20);
        tela.add(endereco);

        JLabel bair = new JLabel("Bairro: *");
        bair.setForeground(new Color(255, 255, 255));
        bair.setBounds(20,260,120,60);
        bair.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(bair);

        JCheckBox inter = new JCheckBox("Internacional");
        inter.setBounds(400,275,120,30);
        inter.setBackground(new Color(51, 51, 51));
        inter.setForeground(new Color(255, 255, 255));
        inter.setFont(new Font("Century Gothic",Font.PLAIN,14));
        inter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internacional = 1;
            }});
        tela.add(inter);

        JTextField bairro = new JTextField("");
        bairro.setBounds(200, 285, 170, 20);
        tela.add(bairro);

        JLabel cida = new JLabel("Cidade: *");
        cida.setForeground(new Color(255, 255, 255));
        cida.setBounds(20,300,150,60);
        cida.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(cida);

        JTextField cidade = new JTextField("");
        cidade.setBounds(200, 325, 170, 20);
        tela.add(cidade);

        JTextField uf = new JTextField("");
        uf.setBounds(380, 325, 40, 20);
        tela.add(uf);

        JLabel rotulo1 = new JLabel("CEP:");
        rotulo1.setForeground(new Color(255, 255, 255));
        rotulo1.setBounds(20,340,80,60);
        rotulo1.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(rotulo1);

        mascaracep = new MaskFormatter("#####-###");
        mascaracep.setPlaceholderCharacter('_');
        JFormattedTextField cep = new JFormattedTextField(mascaracep);
        cep.setBounds(200,365,120,20);
        tela.add(cep);

        JLabel emai = new JLabel("Email:");
        emai.setForeground(new Color(255, 255, 255));
        emai.setBounds(20,380,150,60);
        emai.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(emai);

        JTextField email = new JTextField("");
        email.setBounds(200, 405, 170, 20);
        tela.add(email);

        JLabel tel = new JLabel("Telefone:");
        tel.setForeground(new Color(255, 255, 255));
        tel.setBounds(20,420,120,60);
        tel.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(tel);

        MaskFormatter mascaratel = new MaskFormatter("(##)####-####");
        mascaratel.setPlaceholderCharacter('_');
        JFormattedTextField telefone = new JFormattedTextField(mascaratel);
        telefone.setBounds(200,445,120,20);
        tela.add(telefone);

        JLabel fx = new JLabel("Fax:");
        fx.setForeground(new Color(255, 255, 255));
        fx.setBounds(20,460,150,60);
        fx.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(fx);

        MaskFormatter mascarafax = new MaskFormatter("###.#####.##-#");
        mascarafax.setPlaceholderCharacter('_');
        JFormattedTextField fax = new JFormattedTextField(mascarafax);
        fax.setBounds(200,485,120,20);
        tela.add(fax);

        JLabel nit = new JLabel("NIT ou PIS/PASEP:");
        nit.setForeground(new Color(255, 255, 255));
        nit.setBounds(20,500,150,60);
        nit.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(nit);

        JTextField nitpis = new JTextField("");
        nitpis.setBounds(200, 525, 120, 20);
        tela.add(nitpis);

        JLabel emfat = new JLabel("Emite Fatura?");
        emfat.setForeground(new Color(255, 255, 255));
        emfat.setBounds(20,540,150,60);
        emfat.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(emfat);

        JTextField fatura = new JTextField("");
        fatura.setBounds(200, 565, 60, 20);
        tela.add(fatura);

        JLabel ali = new JLabel("Aliquota de Imposto: ");
        ali.setForeground(new Color(255, 255, 255));
        ali.setBounds(390,540,200,60);
        ali.setFont(new Font("Century Gothic",Font.PLAIN,14));
        tela.add(ali);

        JTextField aliquota = new JTextField("0,00%");
        aliquota.setBounds(540, 565, 60, 20);
        tela.add(aliquota);

        JButton botao = new JButton("Cadastrar");
        botao.setBounds(160, 610, 120, 30);
        botao.setBackground(new Color(28, 164, 33));
        botao.setFont(new Font("Century Gothic",Font.PLAIN,16));
        botao.setForeground(new Color(255, 255, 255));
        tela.add(botao);
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String vfornecedor = fornecedor.getText();
                String vrazao = razao.getText();
                String vfantasia = fantasia.getText();
                String vcpf = cpf.getText();
                String vrepresentante = representante.getText();
                String vendereco = endereco.getText();
                String vbairro = bairro.getText();
                String vcidade = cidade.getText();
                String vcep = cep.getText();
                String vemail = email.getText();
                String vfone = telefone.getText();
                String vfax = fax.getText();
                String vnit = nitpis.getText();
                String vfatura = fatura.getText();
                if(internacional==1){
                    vint = "Sim";
                }
                JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso, dados: \nFornecedor :" + vfornecedor +
                        "\nRazão Social: " + vrazao +
                        "\nNome Fantasia: " + vfantasia +
                        "\nCPF/CNPJ: " + vcpf +
                        "\nRepresentante: " + vrepresentante +
                        "\nEndereço: " + vendereco +
                        "\nBairro: " + vbairro +
                        "\nInternacional? " + vint +
                        "\nCidade: " + vcidade +
                        "\nCEP: " + vcep +
                        "\nEmail: " + vemail +
                        "\nTelefone: " + vfone +
                        "\nFax: " + vfax +
                        "\nNit ou PIS/PASEP" + vnit +
                        "\nFatura: " + vfatura
                );
            }
        });

        JButton cancelar = new JButton("Cancelar");
        cancelar.setBounds(290, 610, 120, 30);
        cancelar.setBackground(new Color(192, 13, 30));
        cancelar.setFont(new Font("Century Gothic",Font.PLAIN,16));
        cancelar.setForeground(new Color(255, 255, 255));
        tela.add(cancelar);

        setSize(700, 700);
        setVisible(true);
        tela.setBackground(new Color(51, 51, 51));


    }


    public static void main(String args[]) throws ParseException{
        main app = new main(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); } }
